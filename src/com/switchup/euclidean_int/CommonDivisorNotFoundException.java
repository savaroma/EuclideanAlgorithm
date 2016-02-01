package com.switchup.euclidean_int;

public class CommonDivisorNotFoundException extends Exception {
    public String getMessage(int a, int b) {
        return "[FAIL]: Integers " + a + " and " + b + " have common divisor equals \"1\"!";
    }
}
