package com.sourav.Problem_Solving.BS_Question_Solving;
// count how many rotation occur in a ratated array
//ans = index od pivot+1;(cz pivot is start from 0)

public class RotationCount {
    public static void main(String[] args) {
        int[]arr={4,5,6,7,0,1,2};
        System.out.println(countRotation(arr));
    }

    public static int countRotation(int [] arr) {
        int pivot=findPivot(arr,0,arr.length-1);
        return pivot+1;
    }
    //use this when no duplicate
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
    //use this when duplicates element in array
    public static int findPivotWithDuplicate(int [] arr,int start,int end){
        while(start <= end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //if elements at middle ,start and end are equal then just skip the duplicate
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicate
                //NOTE: what if these start and end were the pivot
                //check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] > arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted now pivot is in right side
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
