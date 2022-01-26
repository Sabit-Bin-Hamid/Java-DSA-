package com.sourav.Problem_Solving.Recursion;

import java.util.Arrays;

public class mergeSort {
    public static int[] devide(int []arr){
        int mid=arr.length/2;
        if(arr.length==1){
            return arr;
        }
        int[]left=devide(Arrays.copyOfRange(arr,0,mid));
        int[]right=devide(Arrays.copyOfRange(arr,mid,arr.length));
        return conqure(left,right);

    }
    public static int[] conqure(int[]first,int[]second){
        int [] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length ){
            if(first[i]<second[j]){
                mix[k++]=first[i++];
//                i++;
            }else{
                mix[k++]=second[j++];
//                j++;
            }
//            k++;
        }
        while(i<first.length){
            mix[k++]=first[i++];
        }
        while(j<second.length){
            mix[k++]=second[j++];
        }
        return mix;
    }
    public static void main(String[] args) {
        int[]arr={43,0,11,33,55,66,77,3434,1223,5341,111,11111,3435,31234354,6545454,657687989,31225,80897875,987654,765432,987643,233323,43545,57745,3233545,65767565,9,8,7,6,5,4,3,2,1,45,67,34,23,45,67,78,3,543,};
        int[] ans=devide(arr);
        System.out.println(Arrays.toString(ans));
    }
}
