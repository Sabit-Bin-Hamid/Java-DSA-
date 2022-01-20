package com.sourav.Problem_Solving.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(100));

    }//
    static int fibo(int n){
        if(n < 2){
            return n;
        }else
            return fibo(n-1) + fibo(n-2);
    }
}
