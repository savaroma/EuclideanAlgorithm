package com.switchup.euclidean_int;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonDivisorTest {
    @Test (timeout = 3000)
    public void testSearchCommonDivisor() {
        int a = -550;
        int b = 15;
        assertEquals(5, CommonDivisor.searchCommonDivisor(a, b));
    }

    @Test (timeout = 3000)
    public void testSearchWithMinIntegerValue() {
        int a = Integer.MIN_VALUE;
        int b = 16;
        assertTrue(16 == CommonDivisor.searchWithMinIntegerValue(a, b));
    }
}