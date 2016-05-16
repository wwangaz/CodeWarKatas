package CodeWars;

/**
 * Created by wangweimin on 16/2/25.
 */
public class CompleteThePattern {
    public static String pattern(int n) {
        //Happy Coding ^_^
        String s = "";
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                s = s + j;
            }
            if (i != n - 1) s += "\n";
        }
        return s;
    }
}
