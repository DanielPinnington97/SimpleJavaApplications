package com.CodingExcersises_1;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        //checking valid range of year
        if(year <= 1 || year >= 9999){
            return false;
            //Otherwise, if in valid range
        } else {
            //if year is evenly divisible by 4 , check
            //if year is NOT evenly divisible by 100..;
            //go to step 4 , i.e; return true
            if ((year % 4 == 0) && (year % 100 != 0)) {
                return true;
                //For LeapYear all below conditions need to be True
                //Here, you can also simply put (year % 400 == 0)
                //as if divisible by 400 it is divisible by 100 and 4 as well.
            } else if ((year % 4 == 0)
                    && (year % 100 == 0) && (year % 400 == 0)) {
                return true;
                //Otherwise, is Not a LeapYear
            } else {
                return false;
            }
        }
    }

}

