package com.switchup.euclidean_biginteger;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        BigInteger firstValue = new BigInteger("0");
        BigInteger secondValue = new BigInteger("0");
        BigInteger divisor = new BigInteger("0");

        Scanner scanner = new Scanner(System.in);

        boolean isIncorrectValue = true;
        while(isIncorrectValue) {
            try {
                System.out.print("Please, enter first integer value: ");
                firstValue = scanner.nextBigInteger();
                System.out.print("Please, enter second integer value: ");
                secondValue = scanner.nextBigInteger();
                divisor = CommonDivisor.findCommonDivisor(firstValue, secondValue);
                isIncorrectValue = false;
            } catch (InputMismatchException e) {
                System.out.println("\nYou entered wrong value!\n"
                       + "Please, enter INTEGER value.\n");
                scanner.nextLine();
            }
        }

        if (divisor.intValue() > 1) {
            System.out.println("\nCommon divisor is: " + divisor);
        } else {
            System.out.println("\nIntegers " + firstValue + " and " + secondValue + " don't have common divisor.");
        }
    }
}
