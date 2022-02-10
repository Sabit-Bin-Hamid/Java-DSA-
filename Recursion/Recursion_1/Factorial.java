package com.sourav.Problem_Solving.Recursion.Recursion_1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    static int factorial(int n){
        if(n<2){
            return 1;
        }
        return n*factorial(n-1);
    }
}
