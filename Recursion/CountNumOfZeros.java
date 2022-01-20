package com.sourav.Problem_Solving.Recursion;

public class CountNumOfZeros {
    public static void main(String[] args) {
        long n=10010;
        System.out.println(countZero(n));
    }
   static int countZero(long n){
        return helper(n,0);

   }

     static int helper(long n, int count) {
        if(n==0){
            return count;
        }
        long rem=n%10;
        if(rem==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
