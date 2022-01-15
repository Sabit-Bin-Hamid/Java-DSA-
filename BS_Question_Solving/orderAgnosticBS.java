package com.sourav.Problem_Solving.BS_Question_Solving;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=2;
        int res=agnesticBS(arr,target,0, arr.length-1);
        System.out.println(res);
    }
    public static int agnesticBS(int [] arr, int target,int start,int end){
        boolean isAscending= arr[start] < arr[end];
        while(start <= end){
            int mid= start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAscending){
                if(target < arr[mid]){
                    end=mid-1;
                }else start = mid+1;
            }else{
                if(target < arr[mid]){
                    start=mid+1;
                }else end=mid-1;
            }
        }
        return -1;
    }
}
