package com.getjavajob.training.algo.init.hafizov;

import javax.xml.crypto.Data;
import java.util.Calendar;

/**
 * Created by admin on 11.07.2015.
 */
public class Task04_067 {
    public static void main(String[] args) {
        System.out.println(weekend(5));
        System.out.println(weekend(7));
    }

    static String weekend(int day) {
        return day % 7 == 6 || day % 7 == 0 ? "weekend" : "Workday";
    }
}
