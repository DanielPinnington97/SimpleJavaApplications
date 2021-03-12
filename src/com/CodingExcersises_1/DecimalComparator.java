package com.CodingExcersises_1;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double myFirstDouble, double mySecondDouble) {

            int myFirst = (int)(myFirstDouble * 1000);
            int mySecond = (int)(mySecondDouble * 1000);

            if(myFirst - mySecond == 0) {
                return true;
            } else
                return false;
    }

}
