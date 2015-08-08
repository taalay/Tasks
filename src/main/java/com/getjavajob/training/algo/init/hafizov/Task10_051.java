package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 17.07.2015.
 */
public class Task10_051 {
    static public void main(String[] args) {
        System.out.println(procedure1(5));//5 4 3 2 1
        System.out.println(procedure2(5));//1 2 3 4 5
        System.out.println(procedure3(5));
    }

    //� result �������������� 5. �������� ��� ���� � �������� 5-1.
    //� result �������������� 4. �������� ��� ���� � �������� 4-1.
    //� result �������������� 3. �������� ��� ���� � �������� 3-1.
    //� result �������������� 2. �������� ��� ���� � �������� 2-1.
    //� result �������������� 1. �������� ��� ���� � �������� 1-1.
    //0 �� ������ 0, ������������� ������ ������ � �������������� � result =""
    //����� �� ������; result  = 5 <- 4<- 3<- 2<- 1<- null<-
    public static String procedure1(int n) {
        String result = "";
        if (n > 0) {
            result += n;
            result += procedure1(n - 1);
        }
        return result;
    }

    //�������� ��� ���� � �������� 5-1
    //�������� ��� ���� � �������� 4-1
    //�������� ��� ���� � �������� 3-1
    //�������� ��� ���� � �������� 2-1
    //�������� ��� ���� � �������� 1-1
    //0 �� ������ 0, ������������� ������ ������ � �������������� � result =""
    //����� �� ������; result  = 1 <- 2<- 3<- 4<- 5<- null<-
    public static String procedure2(int n) {
        String result = "";
        if (n > 0) {
            result += procedure2(n - 1);
            result += n;
        }
        return result;
    }

    //���������� 5, �������� ��� ���� � �������� 5-1
    //���������� 4, �������� ��� ���� � �������� 4-1
    //���������� 3, �������� ��� ���� � �������� 3-1
    //���������� 2, �������� ��� ���� � �������� 2-1
    //���������� 1, �������� ��� ���� � �������� 1-1
    //0 �� ������ 0. ����� �� �������� ���� � ��� ���� �����
    //���������� 1
    //���������� 2
    //���������� 3
    //���������� 4
    //���������� 5
    public static String procedure3(int n) {
        String result = "";
        if (n > 0) {
            result += n;
            result += procedure3(n - 1);
            result += n;
        }
        return result;
    }
}
