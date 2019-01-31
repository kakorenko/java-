package com.company;

public class Main {

    public static void main(String[] args) {
	int year=1700;
	if (year%400==0){
        System.out.println("високосный");
    }
	else if (year%100==0) {
        System.out.println("не високосный");
    }
    else if (year%4==0) {
        System.out.println("високосный");
    }
	else {
        System.out.println("не високосный");
    }
    }
}
