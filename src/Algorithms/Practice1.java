package Algorithms;

import edu.princeton.cs.algs4.*;

/**
 * Created by wangweimin on 16/3/4.
 */
public class Practice1 {
    public static int i = 0;
    public static void main(String[] args) {
        binomial(10, 5, 0.25);
        StdOut.println(i);
    }

    public static int exR1(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return exR1(a * a, b / 2);
        StdOut.println();
        return exR1(a * a, b / 2) * a;
    }

    public static void sum() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++)
                sum++;
        }
        StdOut.println(sum);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else {
            int r = a % b;
            return gcd(b, r);
        }
    }
    public static double binomial(int N, int k, double p) {
        i++;
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

}
