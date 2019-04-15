package com.company;

public class Cleaner implements Worker {


    @Override
    public void pay() {
        System.out.println("Зарплата 200");
    }

    @Override
    public void stag() {
        System.out.println("Стаж 5 лет");

    }
}
