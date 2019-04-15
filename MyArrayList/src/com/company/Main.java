package com.company;

public class Main {

    public static void main(String[] args) {
	MyArrayList list=new MyArrayList();
	list.add(1);
	list.add(2);
	list.add(3);


	list.print();
	list.remove(2);
	System.out.println();
	list.print();
	//System.out.println(list.get(0));
    }



}
