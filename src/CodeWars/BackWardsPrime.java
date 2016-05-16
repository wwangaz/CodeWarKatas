package CodeWars;

/**
 * Created by wangweimin on 16/2/26.
 */
public class BackWardsPrime {

    public static String backwardsPrime(long start, long end) {
        // your code
        String s = "";
        for (long i = start; i <= end; i++) {
            if (isPrime(i)) {
                StringBuilder sb = new StringBuilder();
                sb.append(i).reverse();
                long reverse = Long.valueOf(sb.toString());
                if (isPrime(reverse) && reverse != i) {
                    s = s + i + " ";
                }
            }
        }
        return s.trim();
    }

    public static boolean isPrime(long number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
