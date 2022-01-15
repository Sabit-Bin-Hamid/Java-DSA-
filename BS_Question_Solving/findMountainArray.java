package com.sourav.Problem_Solving.BS_Question_Solving;

public class findMountainArray {
    public static void main(String[] args) {
        int [] arr={1,3,5,6,8,6,4,2,1,0};
        int target=4;
        int result=findElement(arr,target);
        System.out.println(result);
    }
    public static int findElement(int[] arr,int target){
        int peak=findPeakOfMountainArray(arr,0,arr.length-1);
        int firstTry=agnesticBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return agnesticBS(arr,target,peak+1,arr.length-1);

    }
    public static int findPeakOfMountainArray(int[] arr,int start,int end){

        while(start < end){
            int mid=start+(end-start)/2;
            if(arr[mid] > arr[mid+1] ){
                end=mid;
            }else start=mid+1;
        }
        return start;//or end cz both are equal when condition of BS algorithm break
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
