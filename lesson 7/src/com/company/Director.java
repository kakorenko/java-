package com.company;

public class Director implements Worker  {
    @Override
    public void pay() {
        System.out.println("Зарплата 500");
    }

    @Override
    public void stag() {
        System.out.println("Стаж 10 лет");

    }
}
