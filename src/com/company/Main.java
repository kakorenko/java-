package com.company;

public class Main {

    public static void main(String[] args) {
    	long h = -10;
    	System.out.println(h);

        int []a={-3,5,4,-8,1};
        for (int i=0;i<a.length;i++){
            for(int j=a.length-1;j>i;j--){
                if (a[j]>a[j-1]){
                    int tmp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=tmp;

                }
            }
        }

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
