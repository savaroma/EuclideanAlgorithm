public class CommonDivisor {
    public static int findCommonDivisor(int a, int b) {
        if (a < 0)
            a *= -1;//здесь можно использовать метод класса Math, который берет абсолютное значение, тем самым расширяете знание
        //стандартных джавовских классов
        if (b < 0)
            b *= -1;

        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            }
            else { //поднять элс к фигурной скобке на строку выше
                b %= a;
            }
        }
        return a + b;
    }
}
