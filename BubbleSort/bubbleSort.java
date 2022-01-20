package com.sourav.Problem_Solving.BubbleSort;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[]arr={4,5,6,2,0,1,7};
        bubble(arr);
        //
        System.out.println(Arrays.toString(arr));
        System.out.println(sum(arr));
    }
    static void bubble(int[]arr){
        boolean swaped;
        for (int i=0;i<arr.length;i++){
            swaped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swaped=true;
                }
            }
            if(!swaped){
                break;
            }
        }

    }

    public static int sum(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
