package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 10.07.2015.
 */
public class Task02_039 {

    public static void main(String[] args) {
        System.out.print(getDegree(06, 00, 00));
    }

    static int getDegree(int h, int m, int s) {//� ���� ������� ���� ������
        if (h <= 12 && m <= 59 && s <= 59) {  //������� � ������ �������� ���
            return ((h * 60) + m + (s / 60)) / 2;
        }else if (h <= 23 && m <= 59 && s <= 59) {//������� � ������ �������� ���
            return (((h-12) * 60) + m + (s / 60)) / 2;
        }
        return 0;
    }

}
