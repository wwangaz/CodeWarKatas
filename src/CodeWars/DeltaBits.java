package CodeWars;

/**
 * Created by wangweimin on 16/3/1.
 */
public class DeltaBits {
    public static int convertBits(int a, int b) {
        int c = a ^ b;
        return Integer.bitCount(c);
    }
}
