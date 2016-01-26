public class CommonDivisor {
    public static int findCommonDivisor(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        if (a < 0)
            a *= -1;
        if (b < 0)
            b *= -1;

        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            }
            else {
                b %= a;
            }
        }
        return a + b;
    }
}
