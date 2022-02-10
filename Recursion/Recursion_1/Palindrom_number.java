package com.sourav.Problem_Solving.Recursion.Recursion_1;

import java.util.Scanner;
import java.util.Stack;

public class Palindrom_number {
    public static void main(String[] args) {
        System.out.println(palin(441144));
        System.out.println("For String: "+str_palin("ioi"));
    }
    static boolean palin(int n){
        if(n==reverseNum1(n)){
            return true;
        }
        return false;
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

    static boolean str_palin(String a) {
        String b="";
        int n=a.length()-1;
        for(int i=n;i>=0;i--){
            b+=a.charAt(i);
        }
        if(a.equalsIgnoreCase(b)){
            return true;
        }
        return false;
    }

}
