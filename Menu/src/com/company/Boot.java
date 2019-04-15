package com.company;

import java.util.Scanner;

public class Boot {

    public static void start() {
        Metro a=new Metro();
        Retro b=new Retro();

        Scanner in=new Scanner(System.in);
        System.out.println("Выбирите ресторан");
        int type=in.nextInt();
        Restarant irestarant;

        if (type==1){
            irestarant=a;
        }
        else  {
            irestarant=b;
        }


        while (true){
            System.out.println("1-Меню");
            System.out.println("2-Счет");
            System.out.println("3-Сделать заказ");
            System.out.println("4-Выход");
            System.out.println(irestarant.getCost());
            int nomer=in.nextInt();
            if (nomer==1){
                irestarant.menu();
            }
            if (nomer==2){
                irestarant.bill();
            }
            if(nomer==3){
                irestarant.order();
            }
            if (nomer==4){
                irestarant.exit();
                break;            }
        }
    }
}
