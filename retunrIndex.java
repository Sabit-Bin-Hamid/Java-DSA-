package com.sourav.Problem_Solving;

public class retunrIndex {
    public static void main(String[] args){
        int[] arr={-18,-12,-4,2,5,6,8,9,14,19,25,34,56};
        System.out.println(arr.length);
        int target=56;
        int ans=binarySearch(arr,target);
        System.out.print(ans);
    }

    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
