package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 19.07.2015.
 */
public class Task04_115Test {
    public static void main(String[] args) {
        testCalendar();
    }

    public static void testCalendar() {
        Assert.assertEquals("green Sheep", Task04_115.calendar(2015));
    }
}
