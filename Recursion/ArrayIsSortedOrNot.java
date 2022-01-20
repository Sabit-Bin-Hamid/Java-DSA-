package com.sourav.Problem_Solving.Recursion;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,3,7,6,2};
        System.out.println(sorted(arr,0));

    }
    static boolean sorted( int [] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr,index+1);
    }
}
