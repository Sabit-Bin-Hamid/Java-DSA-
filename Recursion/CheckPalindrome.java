package com.sourav.Problem_Solving.Recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        int n=12321;

        System.out.println(Palindrome(n));

    }
    static boolean Palindrome(int n){
        return (n==rev(n));
    }
    static int rev(int n){
        int digit= (int)(Math.log10(n))+1;
        return helper(n,digit);
    }

    private static int helper(int n, int digit) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem * (int)(Math.pow(10,digit-1)) + helper(n/10,digit-1);
    }
}
