package com.company;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

public class Main {
    static double sum(double[]a){//сумма элементов массива с четными номерами
        double t=0;
        for(int i=0;i<a.length;i+=2){
            t+=a[i];
        }
        return t;
    }


    public static void main(String[] args){
        double[]a={45.0,78.3,1.1,5.0,9.4,14.7,23.2};
        double s=sum(a);
    System.out.println(s);
    }
}
