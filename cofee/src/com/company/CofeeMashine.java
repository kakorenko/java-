package com.company;

public abstract class CofeeMashine implements Mashine {
    public static int water;//объем воды
    public static int coffee;//объем кофе

    public int coffeeCapacity;//кол-во кофе
    public int waterCapacity;//кол-во воды

    @Override
    public void on() {
        System.out.println("Устройство готово к использованию");
    }



    @Override
    public void off() {
        System.out.println("завершение работы");

    }

    @Override
    public void fillwater() {
        water=waterCapacity;
        System.out.println("Бак с водой заполнен");
    }

    @Override
    public void americano() {
            if (coffee-10<0) {
                System.out.println("насыпьте кофе");
                return;
            }
            if (water-90<0) {
                System.out.println("налейте воды");
                return;
            }
            coffee-=10;
            water-=90;
        System.out.println("американо готов");
    }


    @Override
    public void capuchino() {
        if (coffee-10<0) {
            System.out.println("насыпьте кофе");
            return;
        }
        if (water-30<0) {
            System.out.println("налейте воды");
            return;
        }
        coffee-=10;
        water-=30;
        System.out.println("капучино готов");

    }

    @Override
    public void late() {
        if (coffee-10<0) {
            System.out.println("насыпьте кофе");
            return;
        }
        if (water-30<0) {
            System.out.println("налейте воды");
            return;
        }
        coffee-=10;
        water-=30;
        System.out.println("лате готов");
    }



    @Override
    public void fillcoffee() {
        coffee=coffeeCapacity;
        System.out.println("кофе засыпан");

    }

    @Override
    public void state() {
        System.out.println("воды осталось"+water);
        System.out.println("кофе осталось"+coffee);
        }

    }




