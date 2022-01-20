package com.sourav.Problem_Solving.Recursion;

public class factorial {
    public static void main(String[] args) {
        int n=0;
        System.out.println(fac(n));
    }//
    static int fac(int n){
        if(n<=1){
            return 1;
        }
        return n * fac(n-1);
    }
}
