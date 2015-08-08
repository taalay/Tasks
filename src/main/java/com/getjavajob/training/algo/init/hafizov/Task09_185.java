package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 14.07.2015.
 */
public class Task09_185 {
    public static void main(String[] args) {
        String str = brackets("((())))");
        System.out.println(str);//Yes. All right
    }

    public static String brackets(String str) {
        int openB = 0, closeB = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') openB++;
            else if (str.charAt(i) == ')') closeB++;
        }
        if (openB == closeB) {
            return "Yes. All right";
        } else if (openB > closeB) {
            return "No. the number of opening brackets " + openB;
        } else {
            return "No. The first closing bracket " + str.indexOf(")");
        }
    }
}

