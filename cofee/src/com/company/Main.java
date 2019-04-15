package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SaekoLirika f = new SaekoLirika();
        PhilipsHD8829 d = new PhilipsHD8829();
        Scanner in = new Scanner(System.in);
        System.out.println("Выбирите тип машины:1-Saeco, 2-Philips");
        int type = in.nextInt();
        CofeeMashine mashine;// ссылка нанеопредел объект
        if (type == 1) {
            mashine = f;
        } else {
            mashine = d;
        }
        mashine.on();
        mashine.state();
        while (true) {
            System.out.println("1-americano");
            System.out.println("2-capuchino");
            System.out.println("3-late");
            System.out.println("4-state");
            System.out.println("5-заполить водой");
            System.out.println("6-заполнить кофе");
            System.out.println("7-off");
            System.out.println("8-about");
            int menu = in.nextInt();
            if (menu == 1) {
                mashine.americano();
            }
            if (menu == 2) {
                mashine.capuchino();
            }
            if (menu == 3) {
                mashine.late();
            }
            if (menu == 4) {
                mashine.state();
            }
            if (menu == 5) {
                mashine.fillwater();
            }
            if (menu == 6) {
                mashine.fillcoffee();
            }
            if (menu == 7) {
                mashine.off();
                break;
            }
            if (menu==8){
                mashine.about();
            }
        }


    }
}





