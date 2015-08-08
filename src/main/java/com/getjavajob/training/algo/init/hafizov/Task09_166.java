package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 13.07.2015.
 */
public class Task09_166 {
    public static void main(String[] args) {
        String str = removeWord("hello world, how are you");
        System.out.println(str);
    }

    public static String removeWord(String text) {
        String result = "";
        String[] temp = text.split(" ");
        String word1, word2;
        word1 = temp[0];
        word2 = temp[temp.length - 1];
        temp[temp.length - 1] = word1;
        temp[0] = word2;
        for (String str : temp) {
            result += str + " ";
        }

        return new StringBuilder(result).deleteCharAt(result.length() - 1).toString();
    }
}
