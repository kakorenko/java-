package com.company;

import java.util.Scanner;

public abstract  class Restarant implements IRestarant  {
    public Dish [] dishes;
    public int bill;
    public int irestarant;
    public int flag;
    public int i;
    public int r;
    private int cost=0;

    public int getCost(){
        return cost;
    }

    public void setCost(int a){
        cost=a;
    }

    @Override
    public void menu(){
        for (this.i=0;i<dishes.length;i+=1){
            System.out.println((1+i)+"  "+ dishes[i].name+"              "+dishes[i].cost);
            flag=i+1;
        }
        System.out.println();
    }

    @Override
    public void bill(){
        System.out.println("Итого к оплате:   "+cost);

    }

    @Override
    public void order() {
        Scanner in=new Scanner(System.in);
        System.out.println("Сделайте заказ");

        while (true) {
            System.out.println("Введите -1,для перехода в главное меню");
            int r=in.nextInt();
            if (r==-1) {
                break;
            }
            Dish dish=dishes[r-1];
            this.cost = cost + dish.cost;
            System.out.println("Вы выбрали   "+dish.name);
        }
    }
    @Override
    public void exit(){
        System.out.println("Спасибо");
    }



}
