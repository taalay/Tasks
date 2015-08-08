package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task10_049Test {
    public static void main(String[] args) {
        testMaxIndexOfArr();
    }

    public static void testMaxIndexOfArr() {
        int[] arr = {3, 2, 8, 10, 5, 4, 3, 7, 4};
        Assert.assertEquals(4, Task10_049.maxIndexOfArr(arr, arr.length));//индекс начинаеться с 1
    }
}
