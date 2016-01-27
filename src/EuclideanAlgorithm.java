import java.util.InputMismatchException;
import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int divisor = 0;

        Scanner scanner = new Scanner(System.in);

        boolean isCorrectValue = true;
        while(isCorrectValue) {
            try {
                System.out.print("Please, enter first integer value: ");
                a = scanner.nextInt();
                System.out.print("Please, enter second integer value: ");
                b = scanner.nextInt();
                divisor = CommonDivisor.findCommonDivisor(a, b);
                isCorrectValue = false;
            } catch (InputMismatchException e) {
                System.out.println("\nYou entered wrong value!\n"
                       + "Please, enter INTEGER value in the range from -2 147 483 647 to 2 147 483 647\n");
                scanner.nextLine();
            }
        }

        if (divisor > 1) {
            System.out.println("Common divisor is: " + divisor);
        } else {
            System.out.println("Integers " + a + " and " + b + " don't have command divisor.");//слово command - вроде как нужно common
        }
    }
}
