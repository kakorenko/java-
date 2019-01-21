package com.company;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {

    public static void main(String[] args) {/*
        int a=140;
        int b=20;
        if (a<=b || a!=40){
            System.out.println("a<=b");
        }
        else {
            System.out.println("a>=b");
        }*/

        /*int month=1;
        switch (month){
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 7:
                System.out.println(7);
                break;
            default:
                System.out.println("ошибка");
        }*/
        int[] arr=new int[4];
        arr[2]=10;
        arr[0]=-1;
        arr[1]=3;
        arr[3]=9;
       /* int c=arr[2]+arr[0]*arr[1];
        System.out.println(c);*/
       int i=3;
       while(i>=0){
           System.out.println(arr[i]);
           i-=1;
       }
       do {
           System.out.println("hello");
           i+=1;
       }while (i<20);
       for(int f=0; f<arr.length; f+=1){
           System.out.println(arr[f]*arr[f]);
       }

    }
}