package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 15.07.2015.
 */
public class Task10_041 {
    public static void main(String[] args) {
        System.out.println(factorial(15));//1307674368000
    }

    public static long factorial(int i) {
        if (i < 2) {// ������� ��� ������ �� ��������
            return 1;
        } else {
            return i * factorial(i - 1);// �������� factorial ���� ���������� i �� ����� ��������� 1
        }
    }
}
