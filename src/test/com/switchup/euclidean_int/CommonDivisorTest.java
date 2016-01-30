package test.com.switchup.euclidean_int;

import com.switchup.euclidean_int.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CommonDivisorTest {
    private int firstValue;
    private int secondValue;
    private int result;
    public CommonDivisor commonDivisor = new CommonDivisor();

    public CommonDivisorTest(int firstValue, int secondValue, int result) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index}: common divisor({0} and {1}) = {2}")
    public static Iterable<Object[]> getValues() {
        return Arrays.asList(new Object[][] {
                {15, -25, 5},
                {-121, 11, 11},
                {-49, 378, 7},
                {Integer.MIN_VALUE, 154878, 2},
                {1236546, Integer.MIN_VALUE, 2},
                {Integer.MAX_VALUE, 2546, 1},
                {-129, Integer.MAX_VALUE, 1},
                {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}
        });
    }

    @Test
    public void testSetCommonDivisor() throws Exception {
        assertEquals(result, commonDivisor.setCommonDivisor(firstValue, secondValue));
    }
}