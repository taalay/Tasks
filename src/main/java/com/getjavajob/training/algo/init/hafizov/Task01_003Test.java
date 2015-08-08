package com.getjavajob.training.algo.init.hafizov;
import com.getjavajob.training.algo.util.Assert;
/**
 * Created by admin on 19.07.2015.
 */
public class Task01_003Test {
    public static void main(String[] args) {
        testEnterNumber();
    }

    public static void testEnterNumber() {
        Assert.assertEquals("Your number is: 5", Task01_003.enterNumber(5));
    }
}
