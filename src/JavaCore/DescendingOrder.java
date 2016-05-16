package JavaCore; /**
 * Created by wangweimin on 16/1/25.
 */
import java.util.*;
import java.lang.Math;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code
        List<Integer> numbers = new ArrayList<>();
        int numberLeft = num / 10;
        numbers.add(num % 10);
        while(numberLeft!=0){
            numbers.add(numberLeft % 10);
            numberLeft = numberLeft / 10;
        }

        Collections.sort(numbers);
        Collections.reverse(numbers);
        int returnNumber = 0;
        for(int i=0; i < numbers.size(); i++){
            returnNumber = returnNumber + numbers.get(i) * (int) Math.pow(10, (numbers.size()-1-i));
        }

        return returnNumber;
    }
}
