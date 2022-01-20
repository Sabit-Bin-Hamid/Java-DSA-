package com.sourav.Problem_Solving.Recursion;

public class NumberExample {
    public static void main(String[] args) {
        prints(1);
    }
    static void prints(int n){
        if(n==10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        prints(n+1);
    }
}
