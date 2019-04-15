package com.company;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int a=10;
	    int b=12;
	    sum(a,b);
        /*Calendar calendar=Calendar.getInstance();         //календарь
        System.out.println(calendar);
        calendar.set(Calendar.YEAR,2016);
        calendar.add(Calendar.MONTH,15);
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        /*Date d=new Date();        //дата библиотека
        d.setTime(10000);
        System.out.println(d.getTime()/1000);
        Random r=new Random();          //выбор случайного числа
        int c=r.nextInt(100);
        System.out.println(c);
        System.out.println(Math.pow(a,3));*/    //математическая библиотека
        Director j=new Director();
        Cleaner h=new Cleaner();
        pay(j);
        pay(h);
        Result r=getSumsing();
        System.out.println(r.v1);
        System.out.println(r.v2);


    }
    public static  void pay(Worker w){
        w.pay();
        w.stag();

    }

    public static Result getSumsing(){
        Result r=new Result();
        r.v1=10;
        r.v2=20;
        return r;
    }

    public static int sum(int a,int b){
        return a+b;
    }
}
