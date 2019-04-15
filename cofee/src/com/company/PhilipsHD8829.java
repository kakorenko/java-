package com.company;

public class PhilipsHD8829 extends CofeeMashine {
    //1800г воды
    // 250г кофе
    PhilipsHD8829(){
        coffeeCapacity=250;
        waterCapacity=1800;
        coffee=coffeeCapacity;
        water=waterCapacity;
    }

    @Override
    public void about() {
        System.out.println("philips");
    }
}
