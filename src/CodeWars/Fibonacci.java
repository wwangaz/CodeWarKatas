package CodeWars;

import java.math.BigInteger;

/**
 * Created by wangweimin on 16/5/13.
 */
public class Fibonacci {
    public static BigInteger two = new BigInteger("2");
    public static BigInteger three = new BigInteger("3");
    public static BigInteger four = new BigInteger("4");
    public static BigInteger five = new BigInteger("5");
    public static BigInteger six = new BigInteger("6");
    public static BigInteger seven = new BigInteger("7");
    public static BigInteger eight = new BigInteger("8");
    public static BigInteger thirteen = new BigInteger("13");

    public static BigInteger fib(BigInteger n) {
        // ...
        if (n.compareTo(BigInteger.ZERO) < 0) {
            BigInteger positiveN = n.abs();
            boolean isNegative = positiveN.mod(new BigInteger("2")).equals(BigInteger.ZERO);
            return fib(positiveN).multiply(new BigInteger("-1")).multiply(isNegative ? BigInteger.ONE : new BigInteger("-1"));
        }

        if (n.equals(BigInteger.ZERO))
            return BigInteger.ZERO;

        if (n.equals(BigInteger.ONE))
            return BigInteger.ONE;

        if (n.equals(two))
            return BigInteger.ONE;

        if(n.equals(three))
            return two;

        if(n.equals(four))
            return three;

        if(n.equals(five))
            return five;

        if(n.equals(six))
            return eight;

        if(n.equals(seven))
            return thirteen;

        return _fib(n)[0];

//        BigInteger[] results = n.divideAndRemainder(two);
//
//        if (results[1].equals(BigInteger.ZERO)){
//            BigInteger part1 = fib(results[0].add(BigInteger.ONE));
//            BigInteger part2 = fib(results[0].subtract(BigInteger.ONE));
//            return fib(results[0]).multiply((part1.add(part2)));
//        }
//        else return fib(results[0].add(BigInteger.ONE)).pow(2).add(fib(results[0]).pow(2));
    }

    public static BigInteger[] _fib(BigInteger n){
        if(n.equals(BigInteger.ZERO))
            return new BigInteger[]{BigInteger.ZERO, BigInteger.ONE};
        else{
            BigInteger[] ab = _fib(n.divide(two));
            BigInteger c = ab[0].multiply(ab[1].multiply(two).subtract(ab[0]));
            BigInteger d = ab[0].multiply(ab[0]).add(ab[1].multiply(ab[1]));
            if(n.divide(two).equals(BigInteger.ZERO))
                return new BigInteger[]{c, d};
            else return new BigInteger[]{d, c.add(d)};
        }

    }
}
