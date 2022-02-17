package com.sourav.Problem_Solving.Recursion.Recursion_1;

public class countNoOfZeros {
    public static void main(String[] args) {
        System.out.println(count(101000));
    }
    static  int count(int n){
        return helper(n,0);
    }
    static  int helper(int n,int count){
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0)
            return helper(n/10,count+1);

        return helper(n/10,count);
    }

}
