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

    //в result присваиваеться 5. Вызывает сам себя и передает 5-1.
    //в result присваиваеться 4. Вызывает сам себя и передает 4-1.
    //в result присваиваеться 3. Вызывает сам себя и передает 3-1.
    //в result присваиваеться 2. Вызывает сам себя и передает 2-1.
    //в result присваиваеться 1. Вызывает сам себя и передает 1-1.
    //0 не больше 0, возвращаеться пустая строка и присваиваеться к result =""
    //вверх по методу; result  = 5 <- 4<- 3<- 2<- 1<- null<-
    public static String procedure1(int n) {
        String result = "";
        if (n > 0) {
            result += n;
            result += procedure1(n - 1);
        }
        return result;
    }

    //Вызывает сам себя и передает 5-1
    //Вызывает сам себя и передает 4-1
    //Вызывает сам себя и передает 3-1
    //Вызывает сам себя и передает 2-1
    //Вызывает сам себя и передает 1-1
    //0 не больше 0, возвращаеться пустая строка и присваиваеться к result =""
    //вверх по методу; result  = 1 <- 2<- 3<- 4<- 5<- null<-
    public static String procedure2(int n) {
        String result = "";
        if (n > 0) {
            result += procedure2(n - 1);
            result += n;
        }
        return result;
    }

    //выводиться 5, вызывает сам себя и передает 5-1
    //выводиться 4, вызывает сам себя и передает 4-1
    //выводиться 3, вызывает сам себя и передает 3-1
    //выводиться 2, вызывает сам себя и передает 2-1
    //выводиться 1, вызывает сам себя и передает 1-1
    //0 не больше 0. метод не вызывает себя и она идет вверх
    //выводиться 1
    //выводиться 2
    //выводиться 3
    //выводиться 4
    //выводиться 5
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
