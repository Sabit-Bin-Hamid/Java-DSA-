package com.sourav.Problem_Solving.BS_Question_Solving;

public class floorOfaNumber {
    public static void main(String[] args) {
          //flooring of a number is = greatest element in array <= target
        int[] arr={2,3,4,5,7,8,9,10,30,32,33,45};
        int target=24;
        int ans=findFloorNumber(arr,target);
        System.out.println("index: "+ans);
    }
    public static int findFloorNumber(int[] arr,int target){
        int start=0;
        int end =arr.length-1;
        while (start<=end){

            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else return mid;
        }
        return end;
    }
}
