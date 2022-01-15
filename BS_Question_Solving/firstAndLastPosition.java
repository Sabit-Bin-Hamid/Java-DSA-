package com.sourav.Problem_Solving.BS_Question_Solving;
import java.util.Arrays;
public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,5,6,7,8,8,8,9,9,0,0};
        int target=8;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] search(int[]arr, int target){
        int[] ans={-1,-1};
        int forfirst=search(arr,target,0,arr.length-1,true);
        int forlast=search(arr,target,0,arr.length-1,false);
        ans[0]=forfirst;
        ans[1]=forlast;
        return ans;

    }
    public static int search(int[] arr,int target,int start,int end,boolean findFirstIndex){
        int ans=-1;
        while(start<= end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else {
                ans=mid;
                if(findFirstIndex){
                    end=mid-1;
                }else start=mid+1;
            }
        }
        return ans;
    }
}
