package com.sourav.Problem_Solving;

public class orderAgnostivBS {
    public static void main(String[] args){
        int[] arr={-18,-12,-4,2,5,6,8,9,14,19,25,34,56};
        int[] arr2={101,99,56,2,1,-19,-34,-45};
        int target1=56;
        int target=-34;
        int ans=orderAgBS(arr,target1);
        int ans2=orderAgBS(arr2,target);
        System.out.println(ans);
        System.out.println(ans2);
    }

    static int orderAgBS(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc = arr[start] < arr[end];
//        or full structure shown bellow
//        if(arr[start] < arr[end]){
//            isAsc=true;
//        }else isAsc=false;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else start=mid+1;
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else start=mid+1;
            }
        }
        return -1;
    }
}
