package com.getjavajob.training.algo.init.hafizov;

import java.util.Scanner;

/**
 * Created by admin on 12.07.2015.
 */
public class Task06_087 {

    static int aK = 0, bK = 0;// очки
    static String a, b;// teams

    public static void main(String[] args) {
        System.out.println(scoreOfTeam("a", 3));//Team A =3 Team B =0
        System.out.println(scoreOfTeam("b", 2));//Team A =3 Team B =2
        System.out.println(scoreOfTeam("0", 0));//Team A win. Score:3. Team B score=2
    }

    static String scoreOfTeam(String whichTeam, int scored) {

        a = "Team A";
        b = "Team B";

        if (whichTeam.equals("a") || whichTeam.equals("A") || whichTeam.equals("b") || whichTeam.equals("B") && scored > 3 && scored < 0) {

            if (whichTeam.equals("a") || whichTeam.equals("A")) {
                aK += scored;
            } else if (whichTeam.equals("b") || whichTeam.equals("B")) {
                bK = scored;
            }
            return a + " =" + aK + " " + b + " =" + bK;
        } else if (whichTeam.equals("0")) {
            if (aK > bK) {
                return a + " win. Score:" + aK + ". " + b + " score=" + bK;
            } else if (aK < bK) {
                return b + " win. Score:" + bK + ". " + a + " score=" + aK;
            } else {
                return "dead heat. " + a + " score=" + aK + ". " + b + " score=" + bK;
            }
        } else {
            return "enter a or b";
        }

    }
}
