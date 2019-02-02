package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите кол-во элементов");
        int n=scanner.nextInt();

        int[] mass = new int[n];
        System.out.println("введите элементы");
        for (int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            mass[i]=scanner.nextInt();
        }
        int min = 10;
        int max = 1;

        for (int i = 0; i < mass.length; i += 1) {
            if (min > mass[i]) {
                min = mass[i];
            }
        }
        for (int i = 0; i < mass.length; i += 1) {
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
