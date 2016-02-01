package com.switchup.euclidean_int;

public class CommonDivisorNotFoundException extends Exception {
    private final String message = "[FAIL]: ";

    public String getMessage(int a, int b) {
        return message + "Integers " + a + " and " + b + " don't have common divisor";
    }
}
