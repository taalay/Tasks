package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 17.07.2015.
 */
public class Task11_158 {
    public static void main(String[] args) {
        int[] q = {1, 6, 7, 8, 2, 1, 3, 6, 4, 8};
        int[] w = arr(q);
        for (int r : w) {
            System.out.print(r + " ");//7 2 1 3 6 4 8 0 0 0
        }
    }

    public static int[] arr(int[] arr) {
        boolean consilience;//true ���� ���� ����������
        int[] temp = new int[arr.length];// ��������� ������
        int tempSize = 0;//       ������ ����������� �������

        for (int i = 0; i < arr.length; i++) { //���������� �� ����� ���������� �������
            consilience = false;
            for (int n = i + 1; n < arr.length; n++) {// ���� ��� ������ ����������
                if (arr[i] == arr[n]) {
                    consilience = true;
                }
            }
            if (!consilience) {// ���� ���������� ���, �� ��������� i-� ������� � ����� ����� temp
                temp[tempSize] = arr[i];
                tempSize++;
                consilience = false;
            }
        }
        return temp;
    }
}
