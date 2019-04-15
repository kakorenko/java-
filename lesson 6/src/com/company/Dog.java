package com.company;

public class Dog extends Animal {
    String name;


    public Dog() {

    }

    public void say(){
        System.out.println("Gav");


    }

    @Override
    public String toString() {
        return super.toString()+name;
    }
    /*@Override
    public boolean equals(Object obj){//просмотреть
        Dog d=(Dog)obj;
        return name==d.name;
    }*/

    /*@Override
    public int hashCode(){
        return 456;
    }*/
}
