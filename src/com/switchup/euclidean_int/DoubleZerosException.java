package com.switchup.euclidean_int;

public class DoubleZerosException extends Exception {
    public String getMessage() {
        return "Greatest common divisor of two zeros equals infinity!";
    }
}
