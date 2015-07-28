package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 19.07.2015.
 */
public class Task04_036Test {
    public static void main(String[] args) {
        testTrafficLightsRed();
        testTrafficLightsGreen();
    }

    public static void testTrafficLightsRed() {
        Assert.assertEquals("red", Task04_036.trafficLights(3));
    }

    public static void testTrafficLightsGreen() {
        Assert.assertEquals("green", Task04_036.trafficLights(5));
    }
}
