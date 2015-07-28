package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task12_234Test {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        int[][] arr = new int[][]{
                {7, 5, 2, 1, 2, 3, 8},
                {4, 1, 1, 1, 2, 3, 8},
                {1, 3, 8, 1, 2, 3, 8},
                {1, 1, 1, 1, 2, 3, 8},
                {2, 5, 1, 1, 2, 3, 8},
        };

        int[][] result = new int[][]{
                {7, 5, 2, 2, 3, 8, 0},
                {1, 3, 8, 2, 3, 8, 0},
                {1, 1, 1, 2, 3, 8, 0},
                {2, 5, 1, 2, 3, 8, 0},
                {0, 0, 0, 0, 0, 0, 0},
        };
        Assert.assertEquals(result, Task12_234.delOfArr(arr, 1, 3));
    }
}
