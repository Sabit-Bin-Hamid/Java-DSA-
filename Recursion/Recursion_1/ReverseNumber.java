package com.sourav.Problem_Solving.Recursion.Recursion_1;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNum(2345);
        System.out.println(sum);
        int n=123456789;
        System.out.println("reverse_of "+n+" :"+reverseNum1(n));
    }
    static int sum=0;
    static void reverseNum(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverseNum(n/10);
    }

    static int reverseNum1(int n){
        int digit=(int)Math.log10(n)+1;
        return helper(n,digit);
    }
    static  int helper(int n,int digit){
        if(n%10==n){
            return n;

        } int rem=n%10;
        return rem*(int)Math.pow(10,digit-1) +helper(n/10,digit-1);

    }

}
