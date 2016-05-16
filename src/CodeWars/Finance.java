package CodeWars;

/**
 * Created by wangweimin on 16/2/26.
 */

import java.math.BigInteger;

public class Finance {

    public static BigInteger finance(int n) {
        // your code
        Long difference = 3L;
        BigInteger each = BigInteger.ZERO;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i <= n; i++) {
            sum = sum.add(each);
            each = each.add(BigInteger.valueOf(difference));
            difference += 3L;
        }
        return sum;
    }
}
