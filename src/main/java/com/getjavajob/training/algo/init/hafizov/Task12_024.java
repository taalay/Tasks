package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 18.07.2015.
 */
public class Task12_024 {
    public static void main(String[] args){
        showArr(arrNxNA());
        System.out.println();
        showArr(arrNxNB());
    }

    public static int[][] arrNxNA(){
        int[][] arr = new int[6][6];
        for (int i = 0; i<arr.length; i++){
            arr[i][0] = 1;
            arr[0][i] = 1;
        }
        for (int i = 1; i<arr.length; i++){
            for (int j = 1; j<arr.length; j++){
                arr[j][i] =arr[j-1][i] + arr[j][i-1];
            }
        }
        return arr;
    }

    public static int[][] arrNxNB(){
        int[] arr = new int[12];
        int[][] temp = new int[6][6];
        for (int i = 0; i < 6; i++)
        {
            arr[i] = i + 1;
            arr[i + 6] = i + 1;
        }
        for(int i = 0; i<6; i++){
            System.arraycopy(arr, i + 0, temp[i], 0, 6);
        }
        return temp;
    }

    public static void showArr(int[][] arr){
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
