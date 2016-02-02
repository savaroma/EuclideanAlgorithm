package com.switchup.euclidean_int;

import org.junit.Test;
import static org.junit.Assert.*;

public class CommonDivisorTest {
    @Test (timeout = 3000)
    public void testSearchCommonDivisor() throws Exception {
        int a = -550;
        int b = 15;
        assertEquals(5, CommonDivisor.searchCommonDivisor(a, b));
    }

    @Test (timeout = 3000)
    public void testSearchWithMinIntegerValue() throws Exception {
        int a = Integer.MIN_VALUE;
        int b = 16;
        assertTrue(16 == CommonDivisor.searchWithMinIntegerValue(a, b));
    }

    @Test (timeout = 3000, expected = DoubleZerosException.class)
    public void testDoubleZerosException() throws Exception {
        int a = 0;
        int b = 0;

        CommonDivisor.setCommonDivisor(a, b);
    }
}