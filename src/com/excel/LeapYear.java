package com.excel;

/**
 * Business logic to calculate LeapYear.
 * 
 * @author chintan
 *
 */
public class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

}
