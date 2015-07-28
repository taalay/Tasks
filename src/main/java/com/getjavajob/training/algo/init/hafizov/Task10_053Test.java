package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task10_053Test {
    public static void main(String[] args) {
        testArr();
    }

    public static void testArr() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertEquals("987654321", Task10_053.arrInput(arr, arr.length));
    }
}
