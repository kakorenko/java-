package com.company;

public class Cat {
    public String name;
    public int age;

    public int a;
    int hungry;
    public Cat(){
        System.out.println("object");
    }

    public Cat(String name,int age){
        this.name=name;
        this.age=age;
    }

    public int eat() {
       this.a =9;
    }
}
