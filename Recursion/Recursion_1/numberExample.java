package com.sourav.Problem_Solving.Recursion.Recursion_1;

import java.util.PrimitiveIterator;

public class numberExample {
    public static void main(String[] args) {
        PrintNumber(1);
    }
    static void PrintNumber(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintNumber(n+1);

    }
}


