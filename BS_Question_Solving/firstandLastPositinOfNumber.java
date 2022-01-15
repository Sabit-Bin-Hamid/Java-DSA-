package com.sourav.Problem_Solving.BS_Question_Solving;

import java.util.Arrays;

public class firstandLastPositinOfNumber {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,7,7,7,7,7,8,8,9,9,9,9,11,11,11,13,13,13,14,14,15};
        int target=11;
        int[] my=searchPosition(arr,target);
        System.out.println(Arrays.toString(my));


    }
    public static int[] searchPosition(int[] arr, int target){
        int[] ans={-1,-1};
        int start=search(arr,target,true);
        int end=search(arr,target,false);
        ans[0]=start;
        ans[1]=end ;
//        arr[0]=search(arr,target,true);
//        if(ans[0] != -1){
//            ans[1]=search(arr,target,false);
//        }

        return ans;
    }
    public static int search(int[]arr, int target,boolean findFistindex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //potential ans
                ans=mid;
                if(findFistindex){
                    end=mid-1;
                }else start=mid+1;
            }
        }
        return ans;
    }
}
