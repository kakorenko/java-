package com.company;

public class Main {

    public static void main(String[] args) {
        Round r = new Round();
        Triangle t = new Triangle();
        Square s = new Square();
        s.storona=15;
        r.radius = 12.7;
        t.storona=13;
        t.visota=12.6;

        System.out.println(r.square());
        System.out.println(t.square());
        System.out.println(s.square());

        // Math.PI
    }
}
