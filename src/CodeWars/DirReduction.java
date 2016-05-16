package CodeWars;

import java.util.Arrays;

/**
 * Created by wangweimin on 16/2/26.
 */
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        // Your code here.
        String[] before = arr;
        String e = "EAST";
        String s = "SOUTH";
        String w = "WEST";
        String n = "NORTH";
        do {
            arr = before;
            String returnStr = "";
            for (int i = 0; i < arr.length; i++) {
                if (i == (arr.length - 1)) {
                    returnStr += arr[i] + " ";
                    continue;
                }
                if ((arr[i].equals(e) && arr[i + 1].equals(w))
                        || (arr[i].equals(w) && arr[i + 1].equals(e))
                        || (arr[i].equals(s) && arr[i + 1].equals(n))
                        || (arr[i].equals(n) && arr[i + 1].equals(s)))
                    i++;
                else returnStr += arr[i] + " ";
            }
            if(returnStr.equals("")){
                before = new String[0];
                break;
            }
            else before = returnStr.trim().split(" ");
        } while (!Arrays.equals(arr, before));
        return arr;
    }
}
