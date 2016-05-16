package CodeWars;

/**
 * Created by wangweimin on 16/2/29.
 */
public class Dioph {

    public static String solEquaStr(long n) {
        // your code
        long max = (long) (Math.sqrt(n / 100000000d) * 10000);
        String s = "[";
        for (long i = 1; i <= max; i++) {
            if (n % i != 0) continue;
            long x = (n / i + i);
            long y = (n / i - i);
            if (x % 2 != 0) continue;
            if (y % 4 != 0) continue;
            x = x / 2;
            y = y / 4;
            if ((x - 2 * y == i) && (x + 2 * y == n / i))
                s += "[" + x + ", " + y + "]" + ", ";

        }
        s += "]";
        s = s.replace("], ]", "]]");
        return s;
    }

}
