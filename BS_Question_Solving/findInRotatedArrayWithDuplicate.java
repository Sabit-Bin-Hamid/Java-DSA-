package com.sourav.Problem_Solving.BS_Question_Solving;

public class findInRotatedArrayWithDuplicate {
    public static void main(String[] args) {
        int [] nums = {2,5,6,0,0,1,2};
        int target=6;
        System.out.println(search(nums,target));

    }
    public static int search(int [] arr,int target){
        int pivot=findPivotWithDuplicate(arr,0,arr.length-1);
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
