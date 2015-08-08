package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task06_087Test {
    public static void main(String[] args) {
        testScoreOfTeamA();
        testScoreOfTeamB();
        testScoreOfTeam();
    }

    public static void testScoreOfTeamA() {
        Assert.assertEquals("Team A =3 Team B =0", Task06_087.scoreOfTeam("a", 3));
    }

    public static void testScoreOfTeamB() {
        Assert.assertEquals("Team A =3 Team B =2", Task06_087.scoreOfTeam("b", 2));
    }

    public static void testScoreOfTeam() {
        Assert.assertEquals("Team A win. Score:3. Team B score=2", Task06_087.scoreOfTeam("0", 0));
    }
}