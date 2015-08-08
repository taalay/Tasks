package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 11.07.2015. Доделать
 */

public class Task03_026 {

    public static void main(String[] args){
        System.out.print(getBooleanA(false, true, true));
    }

    static boolean getBooleanA(boolean x,boolean y, boolean z){
        return  !(x||y)&&(!x||!z);
    }
    static boolean getBooleanB(boolean x,boolean y, boolean z){
        return  !(!x&&y)||(x&&!z);
    }
    static boolean getBooleanC(boolean x,boolean y, boolean z){
        return  x||!y&&!(x||!z);
    }
}