package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(9);
        System.out.println(list.get(0));
        Integer i=9;
        list.remove(i);
        System.out.println(list.size());

        HashMap<String,Integer>population=new HashMap<>();
        population.put("Belarus",9980000);
        System.out.println(population.get("Belarus"));

    }
}
