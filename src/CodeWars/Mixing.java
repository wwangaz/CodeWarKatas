package CodeWars;

import java.util.Arrays;

/**
 * Created by wangweimin on 16/5/10.
 */
public class Mixing {
    public static String mix(String s1, String s2) {
        // your code
        int[] s1chars = new int[26];
        int[] s2chars = new int[26];
        int max;
        StringBuilder returnString = new StringBuilder();

        int max1 = getChars(s1chars, s1);
        int max2 = getChars(s2chars, s2);
        max = max1 > max2 ? max1 : max2;

        for (int i = max; i >= 2; i--) {
            StringBuilder childSb = new StringBuilder();
            for (int j = 0; j < 26; j++) {
                char[] charsToFill = new char[i];
                if (s1chars[j] == i && s2chars[j] < i) {
                    appendChars(charsToFill, j, childSb, "1");
                } else if (s2chars[j] == i && s1chars[j] < i) {
                    appendChars(charsToFill, j, childSb, "2");
                } else if (s1chars[j] == i && s2chars[j] == i) {
                    appendChars(charsToFill, j, childSb, "=");
                }
            }
            returnString.append(childSb);
        }

        return returnString.toString().replaceFirst("/", "");
    }

    public static int getChars(int[] chars, String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()) {
                char char1 = s.charAt(i);
                if (Character.isLowerCase(char1)) {
                    int index = char1 - 'a';
                    chars[index]++;
                    if (chars[index] > max) max = chars[index];
                }
            }
        }
        return max;
    }

    public static void appendChars(char[] charToFill, int offset, StringBuilder returnStr, String group) {
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        sb.append(group + ":");
        Arrays.fill(charToFill, (char) ('a' + offset));
        sb.append(charToFill);
        int insertIndex = returnStr.length();
        int indexOf2 = returnStr.indexOf("/2");
        int indexOfE = returnStr.indexOf("/=");
        if (group.equals("1")) {
            if(indexOf2 < insertIndex && indexOf2 >= 0)
                insertIndex = indexOf2;
            if(indexOfE < insertIndex && indexOfE >= 0)
                insertIndex = indexOfE;
        }
        if (group.equals("2")) {
            if (indexOfE >= 0)
                insertIndex = indexOfE;
        }

        returnStr.insert(insertIndex, sb);
    }
}

