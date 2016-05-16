package JavaCore;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by wangweimin on 15/12/25.
 */
public class CopyOfTest {
    public static void main(String[] args){
        int[] a = {1, 2, 3};
        a = (int[]) goodOfCopy(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harri"};
        b = (String[]) goodOfCopy(b, 10);
        System.out.println(Arrays.toString(b));
    }

    public static Object goodOfCopy(Object a, int newLength){
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object array = Array.newInstance(componentType, length);
        System.arraycopy(a, 0, array, 0, Math.min(length, newLength));
        return array;
    }
}
