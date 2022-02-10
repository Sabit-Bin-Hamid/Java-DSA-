package com.sourav.Problem_Solving.Recursion.Recursion_1;

public class binarySearch {
    public static void main(String[] args) {
        int []arr = {1,3,5,6,8,9,10,15,17,18,20};
        int target=20;
        System.out.println("index: "+BinarySearch_Recursion(arr,target,0,arr.length-1));

    }
    static int BinarySearch_Recursion(int [] arr,int target,int s,int e){

        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }
            if(target<arr[m]){
               return BinarySearch_Recursion(arr,target,s,m-1);
            }else
                return BinarySearch_Recursion(arr,target,m+1,e);
        }
        return  -1;
    }
}
