package CodeWars;

/**
 * Created by wangweimin on 16/2/25.
 */
public class NthSeries {

    public static String seriesSum(int n) {
        // Happy Coding ^_^
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (i * 3 + 1);
        }
        return String.format("%.2f", sum);
    }
}
