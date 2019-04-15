package com.company;

public class Main {

    public static void main(String[] args) {
        Dog a=new Dog();
        a.say();
        a.name="Tom";



        Dog a2=new Dog();
        a2.name="T";


        if (a.equals(a2)) {
            System.out.println("ravni");
        } else {
            System.out.println("ne ravni");
        }






        System.out.println(a);
        System.out.println(a2);

       /* println(a);*/

        String s = a.toString();
        System.out.println(s);
    }

    public static void println(Object o) {
        String s = o.toString();
        System.out.println(s);
    }
}
