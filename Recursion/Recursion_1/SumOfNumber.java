package com.sourav.Problem_Solving.Recursion.Recursion_1;

public class SumOfNumber {
    public static void main(String[] args) {
        System.out.println("sum: "+Sum(1342423));
        System.out.println("product: "+product(123));
    }
    static int Sum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + Sum(n/10);
    }
    static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * product(n/10);
    }
}
