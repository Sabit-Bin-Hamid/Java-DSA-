package com.sourav.Problem_Solving.BS_Question_Solving;
//question:-Search in roted sorted array
//There is an integer array nums sorted in ascending order (with distinct values).
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
public class RotedSortedArray {
    public static void main(String[] args) {
        int [] num={3,5,1};
        int target=1;
        System.out.println(search(num,target));
    }
    public static int search(int [] arr,int target){
        int pivot=findPivot(arr,0,arr.length-1);
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(target==arr[pivot]){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);

    }
    public static int binarySearch(int [] arr,int target,int start, int end){
        while(start<= end){
            int mid=start+(end-start)/2;
            if(target < arr[mid]){
                end=mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else return mid;
        }
        return -1;
    }


    public static int findPivot(int [] arr,int start,int end){
        while(start <= end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start] ){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}

