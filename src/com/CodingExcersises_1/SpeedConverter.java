package com.CodingExcersises_1;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometresPerHour) {

        //check if the required value is less than 0
        if(kilometresPerHour < 0) {
            return -1;
        }

        //return the final result to the method root name "toMilesPerHour"
        return Math.round(kilometresPerHour / 1.609);
    }

    public static void printConversion(double kilometresPerHour) {

        if(kilometresPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometresPerHour);
            System.out.println(kilometresPerHour + "KM/H = " + milesPerHour + "MI/H");
        }

    }

}
