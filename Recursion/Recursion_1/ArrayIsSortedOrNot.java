package com.sourav.Problem_Solving.Recursion.Recursion_1;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int []a={1,4,7,9,10,12,15,16,19,20};
        System.out.println(sorted(a,0));
    }

    static boolean sorted(int [] a,int index){
        if(index==a.length-1){
            return true;
        }
        return a[index]<a[index+1] && sorted(a,index+1);
    }
}
