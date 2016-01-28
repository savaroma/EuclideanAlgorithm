package com.switchup.euclidean_int;

public class CommonDivisor {
    public static int findCommonDivisor(int a, int b) {
        while (a != 0 && b != 0) {
            if (Math.abs(a) > Math.abs(b)) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return Math.abs(a) + Math.abs(b);
    }
}
