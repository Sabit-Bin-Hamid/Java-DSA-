package com.sourav.Problem_Solving.BS_Question_Solving;
//finding the peak of a mountain array or a bitonic array
public class peakOfMountainArray {
    public static void main(String[] args) {
        int []arr={1,3,4,6,7,5,4,2,1,0};
        int ans=findPeakOfMountainArray(arr,0,arr.length-1);
        System.out.println(ans);
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
}
