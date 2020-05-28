package com.excel;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit LeapYearTest.
 * 
 * All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year), 
 * All years divisible by 100 but not by 400 are NOT leap years (so,
 * for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year), 
 * All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016), 
 * All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
 * 
 * @author chintan
 *
 */
public class LeapYearTest {

    private LeapYear leapYear;

    @Before
    public void setUp() throws Exception {
        leapYear = new LeapYear();
    }

    @Test
    public void test2000IsALeapYear() {
        boolean result = leapYear.isLeapYear(2000);
        assertTrue(result);
    }

    @Test
    public void test2001IsNotALeapYear() {
        boolean result = leapYear.isLeapYear(2001);
        assertFalse(result);
    }

    @Test
    public void test1700IsNotALeapYear() {
        boolean result = leapYear.isLeapYear(1700);
        assertFalse(result);
    }

    @Test
    public void test2100IsNotALeapYear() {
        boolean result = leapYear.isLeapYear(2100);
        assertFalse(result);
    }

    @Test
    public void test2008IsALeapYear() {
        boolean result = leapYear.isLeapYear(2008);
        assertTrue(result);
    }

}
