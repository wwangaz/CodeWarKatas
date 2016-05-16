package JavaCore;

import java.util.Date;

/**
 * Created by wangweimin on 16/1/4.
 */
public class TemplateTest {
    public static void main(String[] args) {
        Manager ceo = new Manager("Gus Greedy", 800000, 2012, 12, 15);
        Manager cfo = new Manager("Sid Sneaky", 600000, 2012, 12, 15);

        Pair<Manager> buddies = new Pair<>(ceo, cfo);
        printBuddies(buddies);

        ceo.setBonus(1000000);
        cfo.setBonus(800000);
        Manager[] managers = {ceo, cfo};

        Pair<Employee> result = new Pair<>();
        minmaxBonus(managers, result);
        printBuddies(result);
        maxminBonus(managers, result);
        printBuddies(result);
    }

    //带有子类型限定的通配符可以从泛型对象读取
    public static void printBuddies(Pair<? extends Employee> pair) {
        Employee first = pair.getFirst();
        Employee second = pair.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + "are buddies.");
    }

    //带有超类型限定的通配符可以向泛型对象写入
    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result){
        if(a == null || a.length ==0 ) return;
        Manager min = a[0];
        Manager max = a[0];
        for(Manager m : a){
            if(min.getBonus() > m.getBonus()) min = m;
            if(max.getBonus() < m.getBonus()) max = m;
        }
        result.setFirst(min);
        result.setSecond(max);
    }

    public static void maxminBonus(Manager[] a, Pair<? super Manager> result){
        minmaxBonus(a, result);
        PairAlg.swap(result);
    }
}

class PairAlg{
    /**
     * 可以使用泛型方法
     * public static <T> boolean hasNulls(Pair<T> p)
     * 两者均可,使用通配符可读性好
     * @param p
     * @return
     */
    public static boolean hasNulls(Pair<?> p){
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p){
        swapHelper(p);
    }

    //中途转换,使得可以使用泛型类型,而通配符是不可以使用的
    public static <T> void swapHelper(Pair<T> p){
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }

}

class Pair<T> {
    private T first, second;

    public Pair(){
    }

    public Pair(T a, T b) {
        first = a;
        second = b;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

class Employee {
    private String name;
    private double salary;
    private Date employDate;

    public Employee(String a, double b, int year, int month, int day) {
        name = a;
        salary = b;
        employDate = new Date(year, month, day);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name +
                '}';
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String a, double b, int y, int m, int d){
        super(a, b, y, m, d);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
