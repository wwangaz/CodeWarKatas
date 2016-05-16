package CodeWars;

import java.util.Arrays;

/**
 * Created by wangweimin on 16/2/26.
 */
public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        String s = "";
        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s2.contains(s1)) {
                    s = s + s1 + " ";
                    break;
                }
            }
        }
        s = s.trim();
        if(s.equals("")) return new String[0];
        String[] returnArray = s.split(" ");
        Arrays.sort(returnArray);
        System.out.println(returnArray.length);
        return returnArray;
    }
}

