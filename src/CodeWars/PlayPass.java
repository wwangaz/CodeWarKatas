package CodeWars;

/**
 * Created by wangweimin on 16/2/25.
 */
public class PlayPass {
    public static String playPass(String s, int n) {
        // your code
        char[] sequence = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        n = n % 26;
        boolean isOdd = true;
        for (int i = 0; i < sequence.length; i++) {
            if (Character.isLetter(sequence[i])) {
                if (sequence[i] + n > 25 + 'A') sequence[i] -= 26 - n;
                else sequence[i] += n;
                if (!isOdd) sequence[i] = Character.toLowerCase(sequence[i]);
            } else if (Character.isDigit(sequence[i]))
                sequence[i] = (char) ('0' + '9' - sequence[i]);
            isOdd = !isOdd;
            sb.insert(0, sequence[i]);
        }
        return sb.toString();
    }
}
