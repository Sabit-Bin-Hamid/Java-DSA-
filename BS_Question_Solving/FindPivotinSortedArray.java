package com.sourav.Problem_Solving.BS_Question_Solving;

public class FindPivotinSortedArray {
    public static void main(String[] args) {
            int [] num={4,5,6,7,0,1,2};
            System.out.println(findPivot(num,0,num.length-1));
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
