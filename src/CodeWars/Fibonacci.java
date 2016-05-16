package CodeWars;

import java.math.BigInteger;

/**
 * Created by wangweimin on 16/5/13.
 */
public class Fibonacci {
    public static BigInteger fib(BigInteger n) {
        // ...
        if (n.compareTo(BigInteger.ZERO) < 0) {
            BigInteger positiveN = n.abs();
            boolean isNegative = positiveN.mod(new BigInteger("2")).equals(BigInteger.ZERO);
            return fib(positiveN).multiply(new BigInteger("-1")).multiply(isNegative ? BigInteger.ONE : new BigInteger("-1"));
        }

        int thresholdInt = (int) Math.sqrt(n.doubleValue());
        BigInteger threshold = new BigInteger(thresholdInt + "");

        return fib(n, threshold);
    }

    public static BigInteger fib(BigInteger n, BigInteger threshold) {

        if (n.equals(BigInteger.ZERO))
            return BigInteger.ZERO;
        if (n.equals(BigInteger.ONE))
            return BigInteger.ONE;
        
        if (n.compareTo(threshold.add(BigInteger.ONE)) <= 0)
            return fib(n.subtract(BigInteger.ONE), threshold).add(fib(n.subtract(new BigInteger("2")), threshold));
        else {
            BigInteger part1 = fib(threshold.add(BigInteger.ONE), threshold).multiply(fib(n.subtract(threshold), threshold));
            BigInteger part2 = fib(threshold, threshold).multiply(fib(n.subtract(threshold).subtract(BigInteger.ONE), threshold));
            return part1.add(part2);
        }
    }

}
