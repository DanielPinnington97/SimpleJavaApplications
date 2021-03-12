package com.CodingExcersises_1;

import java.time.LocalDate;
import java.util.Date;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
            return false;
        }
        return true;
    }


}

//wake up if dog is barking before 8 or after 22 hours