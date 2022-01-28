package com.sourav.Problem_Solving.BS_Question_Solving;

public class SplitArray {
    public static void main(String[] args) {
        //Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.
        //
        //Write an algorithm to minimize the largest sum among these m subarrays.
        int[] nums={7,2,5,10,8};
        int m=3;
        System.out.println(splitArray(nums,m));

    }
    public static int splitArray(int[] nums, int m) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end += nums[i];
        }
        //apply bnary search
        while(start<end){
            int mid=start+(end-start)/2;
            //calculate no of pices we wans this this max sum which is our min
            int sum=0;
            int pices=1;
            for(int num : nums){
                if(sum + num > mid){
                    //that means you can not add new num in subarray
                    //so crate new subarray to,so=>> sum=num
                    sum = num;
                    pices++;
                }else{
                    sum+=num;
                }
            }
            if(pices > m){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;//or end cz in this case start==end
    }
}
