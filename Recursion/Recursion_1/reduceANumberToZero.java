package com.sourav.Problem_Solving.Recursion.Recursion_1;

public class reduceANumberToZero {
    public static void main(String[] args) {
        System.out.println("No Of steps: "+steps(8));
    }
    /**
     * Given an integer num, return the number of steps to reduce it to zero.
     * In one step, if the current number is even, you have to divide it by 2,
     * otherwise, you have to subtract 1 from it.
     */

    static int steps(int n){
        return helper(n,0);
    }
    static int helper(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return helper(n/2,c+1);
        }
        return helper(n-1,c+1);
    }
}
