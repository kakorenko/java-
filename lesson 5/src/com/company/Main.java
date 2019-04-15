package com.company;

public class Main {
    public static void test(Cat c){
        c.name="hh";
    }

    public static void main(String[] args) {
        Cat c1=new Cat("tom",7);
        c1.name="ttt";
        c1.eat();

        System.out.println(c1.name);
        System.out.println(c1.eat());
    }
}
