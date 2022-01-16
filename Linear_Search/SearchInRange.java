package com.sourav.Problem_Solving.Linear_Search;

import java.util.Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        int[]arr = {12,34,56,38,90,56,16};
        int target=56;
        System.out.println(search(arr,target,2,4));
    }
    public static int search(int[]arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
