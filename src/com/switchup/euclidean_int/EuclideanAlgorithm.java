package com.switchup.euclidean_int;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int divisor = 0;

        Scanner scanner = new Scanner(System.in);

        boolean isDivisorFound = true;
        boolean isIncorrectValue = true;
        while(isIncorrectValue) {
            try {
                System.out.print("Please, enter first integer value: ");
                a = scanner.nextInt();
                System.out.print("Please, enter second integer value: ");
                b = scanner.nextInt();
                divisor = CommonDivisor.setCommonDivisor(a, b);
                isIncorrectValue = false;
            } catch (InputMismatchException e) {
                System.out.printf("\nYou entered wrong value!\n"
                       + "Please, enter INTEGER value in the range from %,d to %,d\n",
                        Integer.MIN_VALUE, Integer.MAX_VALUE);
                scanner.nextLine();
            } catch (DoubleZerosException e) {
                System.out.println("\n" + e.getMessage());
                isDivisorFound = false;
                break;
            } catch (CommonDivisorNotFoundException e) {
                System.out.println("\n" + e.getMessage(a, b));
                isDivisorFound = false;
                isIncorrectValue = false;
            }
        }

        if (isDivisorFound) {
            if (divisor == Integer.MIN_VALUE) {
                System.out.println("\nCommon divisor is: 2 147 483 648.");
            } else {
                System.out.println("\nCommon divisor is: " + divisor);
            }
        }
    }
}
