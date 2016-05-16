package CodeWars;

/**
 * Created by wangweimin on 16/3/1.
 */
public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        // your code
        char[] chars = str2.toCharArray();
        StringBuilder sb = new StringBuilder(str1);
        for (char ch : chars) {
            int index = sb.indexOf(ch + "");
            if (index == -1) return false;
            sb.deleteCharAt(index);
        }
        return true;
    }
}
