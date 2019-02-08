package com.company;

public class Main {

    public static void main(String[] args) {
        int n=31;
        int []a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=i;
        }

        for(int i=2;i<a.length;i++){
            for(int j=2;j<i;j++){
                if ((i%j)==0){
                    System.out.println("не целое"+a[i]);
                    break;
                }

            }

        }
    }
}

