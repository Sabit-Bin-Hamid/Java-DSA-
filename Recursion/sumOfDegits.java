package com.sourav.Problem_Solving.Recursion;

public class sumOfDegits {
    public static void main(String[] args) {
        int n=98;
        System.out.println(sumDegits(n));
        int ans=product(23);
        System.out.println(ans);
    }
    static int sumDegits(int n){
        if(n==0){
            return 0;
        }
        return (n%10) +sumDegits(n/10);
    }
    static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) *product(n/10);
    }
}
