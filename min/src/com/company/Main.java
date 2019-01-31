package com.company;

public class Main {

    public static void main(String[] args) {
        int[] mass = new int[10];
        int min = 10;
        int max = 1;
        for (int i = 0; i < mass.length; i += 1) {
            mass[i] = i;
        }
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
