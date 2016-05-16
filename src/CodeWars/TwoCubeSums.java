package CodeWars;

/**
 * Created by wangweimin on 16/2/26.
 */
public class TwoCubeSums {
    public static boolean hasTwoCubeSums(int n) {
        //your code here
        double maximum = Math.pow((double) n / 2, 1.0 / 3.0);
        int count = 0;
        for (double i = 1; i < maximum ; i++) {
            double secondNumber = Math.pow((n - Math.pow(i, 3)), 1.0 / 3.0);
            if (Math.abs(secondNumber - Math.round(secondNumber)) < 0.00001 && i < Math.round(secondNumber))
                count++;
        }
        return count >= 2;
    }
}
