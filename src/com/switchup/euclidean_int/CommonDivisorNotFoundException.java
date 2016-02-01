package com.switchup.euclidean_int;

public class CommonDivisorNotFoundException extends Exception {
    private final String message = "[FAIL]: "; //по-моему излишне выносить в поле класса это одно слово. И идея так считает.

    public String getMessage(int a, int b) {
        return message + "Integers " + a + " and " + b + " have common divisor equals \"1\"!";
    }
}
