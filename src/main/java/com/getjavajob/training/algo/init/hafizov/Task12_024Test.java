package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task12_024Test {
    public static void main(String[] args) {
        testA();
        testB();
    }

    public static void testA() {
        int[][] arr = new int[][]{
                {1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6},
                {1, 3, 6, 10, 15, 21},
                {1, 4, 10, 20, 35, 56},
                {1, 5, 15, 35, 70, 126},
                {1, 6, 21, 56, 126, 252}
        };

        Assert.assertEquals(arr, Task12_024.arrNxNA());
    }

    public static void testB() {
        int[][] arr = new int[][]{
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 1},
                {3, 4, 5, 6, 1, 2},
                {4, 5, 6, 1, 2, 3},
                {5, 6, 1, 2, 3, 4},
                {6, 1, 2, 3, 4, 5},
        };

        Assert.assertEquals(arr, Task12_024.arrNxNB());
    }
}
