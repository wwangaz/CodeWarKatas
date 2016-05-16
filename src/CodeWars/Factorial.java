package CodeWars;

/**
 * Created by wangweimin on 16/2/23.
 */
public class Factorial {
    public int factorial(int n) {
        // Happy coding :-)
        if (n < 0 || n > 12)
            throw new IllegalArgumentException();
        int factorial = 1;
        while (n > 0) {
            factorial = factorial * n;
            n--;
        }
        return factorial;
    }
}
