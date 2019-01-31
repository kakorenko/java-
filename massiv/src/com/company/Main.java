package com.company;

public class Main {

    public static void main(String[] args) {
        int []massiv=new int[30];
            for(int i=1;i<massiv.length;i+=1){
                massiv[i]=i;
            }
            for(int i=1;i<20;i+=2){
                System.out.println((i)+ " элемент массива");
            }
    }
}
