package com.company;

public class Main {

    public static void main(String[] args) {
        int n=11;
        int j =2;
        for(int i=3;i<n;i++){
            boolean flag = false;

            for(j=2;j<i;j++){
                if ((i%j)==0){
                    flag = true;
                    break;
                }
            }

            // 1 способ
            /*if(j==i){
                System.out.println(i);
            }*/

            // 2 способ
            if(flag==false){
                System.out.println(i);
            }


        }
    }
}

