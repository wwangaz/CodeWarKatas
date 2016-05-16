package CodeWars;

/**
 * Created by wangweimin on 16/2/26.
 */
public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        int s = 0, e = 0;
        if (walk.length != 10) {
            return false;
        }
        for (char c : walk) {
            switch (c) {
                case 's':
                    s++;
                    break;
                case 'n':
                    s--;
                    break;
                case 'e':
                    e++;
                    break;
                case 'w':
                    e--;
                    break;
            }
        }
        return s + e == 0;
    }
}
