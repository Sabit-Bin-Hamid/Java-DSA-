package com.sourav.Problem_Solving.BS_Question_Solving;

public class celingOfaNumber {
    public static void main(String[] args) {
        //    ceiling of a number is = Smallest element in array grater(>) or equal to(=) target

        int[] arr={2,3,4,5,7,8,9,10,30,32,33,45};
        int target=4;
        int ans=findCeilingNumber(arr,target);
        System.out.println("index: "+ans);
    }

    public static int findCeilingNumber(int[] arr,int target){
//         what if is target number is greater than the last value in array
        if(target > arr.length-1){
            return -1;
        }
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
        return start;
    }
}


