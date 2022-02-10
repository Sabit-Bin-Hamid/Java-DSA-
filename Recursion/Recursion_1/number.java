package com.sourav.Problem_Solving.Recursion.Recursion_1;

public class number {
    public static void main(String[] args) {
//        funNum_rev(5);
        funNum_Both(5);
    }
    static void funNum(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        funNum(n-1);
    }
    static void funNum_rev(int n){
        if(n==0){
            return ;
        }

        funNum_rev(n-1);
        System.out.println(n);
    }
    static void funNum_Both(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        funNum_Both(n-1);
        System.out.println(n);
    }
}
