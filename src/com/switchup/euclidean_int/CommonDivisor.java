package com.switchup.euclidean_int;

public class CommonDivisor {
    public static int setCommonDivisor(int a, int b) throws DoubleZerosException {
        if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (a == Integer.MIN_VALUE || b == Integer.MIN_VALUE) {
            return searchWithMinIntegerValue(a, b);
        } else {
            return searchCommonDivisor(a, b);
        }
    }

    public static int searchCommonDivisor(int a, int b) throws DoubleZerosException {
        if (((a == 0) && (b == 0))) {
            throw new DoubleZerosException();
        }

        while (a != 0 && b != 0) {
            if (Math.abs(a) > Math.abs(b)) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return Math.abs(a) + Math.abs(b);
    }

    public static int searchWithMinIntegerValue(int a, int b) throws DoubleZerosException {
        if (a == Integer.MIN_VALUE) {
            a %= b;
        } else {
            b %= a;
        }
        return searchCommonDivisor(a, b);
    }
}
