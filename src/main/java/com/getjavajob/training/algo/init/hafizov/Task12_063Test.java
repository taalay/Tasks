package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task12_063Test {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        int[][] schoolboysArr = {
                {13, 18, 14, 17},
                {14, 17, 13, 15},
                {15, 13, 14, 17},
                {14, 17, 13, 15},
                {15, 18, 14, 13},
                {17, 15, 13, 15},
                {15, 18, 14, 17},
                {14, 19, 13, 17},
                {14, 15, 13, 15},
                {15, 18, 14, 17},
                {14, 17, 13, 15}
        };
        int[] result = {62, 59, 59, 59, 60, 60, 64, 63, 57, 64, 59};
        Assert.assertEquals(result, Task12_063.schoolboys(schoolboysArr));
    }
}
