package com.excel;

/**
 * Business logic to calculate LeapYear.
 * 
 * @author chintan
 *
 */
public class LeapYear {

    public boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                isLeapYear = true;
            }
        } else if (year % 4 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;
    }
}
