package com.company;

public class Main {
   static int max(int a,int b){

        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }

    static int sum(int[]a){
       int r=0;
       for(int i=0;i<a.length;i+=1){
           r+=a[i];
       }
       return r;
    }
        static  float sqr( float a){
       return a*a;
    }

    /**
     * Find average value from array
     *
     * @param a input array
     */
    static float avg(int[] a){
       float t=0;
       for(int i=0;i<a.length;i+=1){
           t+=a[i];
       }
       float s=t/a.length;
       return s;
    }

    public static void main(String[] args) {
	    int result=max(5,9);
        System.out.println(result);
        float rrr=sqr(25);
        System.out.println(rrr);
        int[]a={5,-8,7};
        int s=sum(a);
        System.out.println(s);
        float p=avg(a);
        System.out.println(p);
        int x=max(3,7);
        int a1 = 20;
        double r1 = 3.0;
    }
}
