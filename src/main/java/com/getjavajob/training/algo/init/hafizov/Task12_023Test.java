package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task12_023Test {
    public static void main(String[] args) {
        testA();
        testB();
        testV();
    }

    public static void testA() {
        int[][] arr = new int[][]{
                {1, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 1}
        };
        Assert.assertEquals(arr, Task12_023.arrOfA());
    }

    public static void testB() {
        int[][] arr = new int[][]{
                {1, 0, 0, 1, 0, 0, 1},
                {0, 1, 0, 1, 0, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 1, 0, 1, 0},
                {1, 0, 0, 1, 0, 0, 1}
        };

        Assert.assertEquals(arr, Task12_023.arrOfB());
    }

    public static void testV() {
        int[][] arr = new int[][]{
                {1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1}
        };
        Assert.assertEquals(arr, Task12_023.arrOfV());
    }

}
