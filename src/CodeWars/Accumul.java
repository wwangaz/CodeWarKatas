package CodeWars;

import java.util.Arrays;

/**
 * Created by wangweimin on 16/2/25.
 */
public class Accumul {
    public static String accum(String s) {
        // your code
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char ch : s.toCharArray()) {
            if(i>0) sb.append("-");
            sb.append(Character.toUpperCase(ch));
            for (int j = 0; j < i; j++) {
                sb.append(Character.toLowerCase(ch));
            }
            i++;
        }
//        for (int i = 0; i < sequence.length; i++) {
//            char[] array = new char[i];
//            sb.append(Character.toUpperCase(sequence[i]));
//            Arrays.fill(array, Character.toLowerCase(sequence[i]));
//            sb.append(array);
//            if (i != sequence.length - 1) sb.append("-");
//        }
        return sb.toString();
    }
}
