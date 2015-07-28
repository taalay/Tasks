package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 13.07.2015.
 */
public class Task09_107 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Jac hello my friend");
    }

    static String removeAO(String in) {
        StringBuilder str = new StringBuilder(in);
        int intO = -1, intA = -1;
        String a = "a";
        String o = "o";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(o, i) >= 0) {
                intO = str.indexOf(o, i);
            }
        }
        intA = str.indexOf(a);

        if (intO >= 0 && intA >= 0) {
            str.setCharAt(intA, 'o');
            str.setCharAt(intO, 'a');

            return str.toString();
        } else {
            return "a and o not found";
        }
    }
}

