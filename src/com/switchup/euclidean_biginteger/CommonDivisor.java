package com.switchup.euclidean_biginteger;

import java.math.BigInteger;

public class CommonDivisor {
    public static BigInteger findCommonDivisor(BigInteger a, BigInteger b) {
        while (a.signum() != 0 && b.signum() != 0) {
            if (a.abs().compareTo(b.abs()) == 1) {
                a = a.remainder(b);
            }
            else {
                b = b.remainder(a);
            }
        }
        return a.abs().add(b.abs());
    }
}
