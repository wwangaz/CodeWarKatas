package CodeWars;

/**
 * Created by wangweimin on 16/3/1.
 */
public class Suite {

    public static double going(int n) {
        // your code
        double sum = 0;
        for (int j = 1; j <= n; j++) {
            double factorial_n = 1;
            for (int i = n; i > j; i--) {
                factorial_n = factorial_n * 1/i;
            }
            sum += factorial_n;
        }
        return (double) ((int) (sum * 1000000)) / 1000000.0;

    }
}
