package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

public class Task05_010Test {
        public static void main(String[] args) {
            test();
        }

        public static void test() {
            Assert.assertEquals("1$ = 55rub\n" +
                    "2$ = 110rub\n" +
                    "3$ = 165rub\n" +
                    "4$ = 220rub\n" +
                    "5$ = 275rub\n" +
                    "6$ = 330rub\n" +
                    "7$ = 385rub\n" +
                    "8$ = 440rub\n" +
                    "9$ = 495rub\n" +
                    "10$ = 550rub\n" +
                    "11$ = 605rub\n" +
                    "12$ = 660rub\n" +
                    "13$ = 715rub\n" +
                    "14$ = 770rub\n" +
                    "15$ = 825rub\n" +
                    "16$ = 880rub\n" +
                    "17$ = 935rub\n" +
                    "18$ = 990rub\n" +
                    "19$ = 1045rub\n" +
                    "20$ = 1100rub\n", Task05_010.coursOfDollar(55));
        }
}
