package com.sourav.Problem_Solving;

public class que1CelingofANumber {
    public static void main(String[] args) {
        int[] arr1={11,29,38,43,59,61,77,89,100};
        int[] arr2={100,45,35,26,19,15,12};
        int target=47;
        int answer=ordeerAgBs(arr2,target);
        System.out.println(answer);
        System.out.println();
    }

    static int ordeerAgBs(int[] arr ,int target){

        int start=0;
        int end =arr.length-1;

        boolean isAsc= arr[start]<arr[end];

        while (start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }else end= mid-1;
            }else {
                if(target>arr[mid]){
                    end=mid-1;
                }else start=mid+1;
            }
        }
        return start;
    }
}


