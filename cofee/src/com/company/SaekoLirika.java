package com.company;

public class SaekoLirika extends CofeeMashine {

    public SaekoLirika() {
        coffeeCapacity=500;
        waterCapacity=2500;
        coffee=coffeeCapacity;
        water=waterCapacity;


    }


    @Override
    public void about() {
        System.out.println("saeco");
    }
}
