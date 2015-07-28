package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 12.07.2015.
 */
public class Task05_064 {
    public static void main(String[] args) {
        int[] people = {545, 757, 5785, 578, 57, 58757, 255, 786, 1237, 562, 563, 4568};
        int[] km = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(residents(people, km));//12000
    }

    /**
     * @param people
     * @param km
     * @return
     */
    static int residents(int[] people, int[] km) {
        int temp = 0;
        if (people.length == km.length) {
            for (int i = 0; i < km.length; i++) {
                temp += people[i] * km[i];
            }
        }
        return temp;
    }
}
