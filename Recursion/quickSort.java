package com.sourav.Problem_Solving.Recursion;

import java.util.Arrays;

public class quickSort {
    public static int Partition(int[] arr, int p, int r) {
        int x=arr[r];
        int i=p-1;
        for (int j=p;j<r;j++){
            if(arr[j]<=x){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=x;
        arr[r]=temp;
        return i;

    }
    public static void quickSort(int[]arr,int p, int r){
        if(p<r){
            int q=Partition(arr,p,r);
            quickSort(arr,p,q-1);
            quickSort(arr,q+1,r);
        }

    }



    public static void main(String[] args) {
        int[]arr={9,7,8,5,3,1,2,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
