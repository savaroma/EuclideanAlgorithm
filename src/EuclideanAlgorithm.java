import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int a;
        int b;
        int divisor;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter first integer value: ");
        a = scanner.nextInt();
        System.out.print("Please, enter second integer value: ");
        b = scanner.nextInt();
        divisor = CommonDivisor.findCommonDivisor(a, b);

        if (divisor > 1) {
            System.out.println("Common divisor is: " + divisor);
        } else {
            System.out.println("Integers " + a + " and " + b + "don't  have command divisor.");
        }
    }
}
