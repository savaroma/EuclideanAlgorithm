package com.switchup.euclidean_int;

public class DoubleZerosException extends Exception {//Туалетное исключение :)
    public String getMessage() {
        return "Greatest common divisor of two zeros equals infinity!";
    }
}
