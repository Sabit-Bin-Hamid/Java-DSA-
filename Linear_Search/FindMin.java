package com.sourav.Problem_Solving.Linear_Search;

public class FindMin {
    public static void main(String[] args) {
        int[]arr = {124,34,56,38,90,56,16};
        System.out.println(min(arr));
    }
    static int min(int[]arr){
        //lets assume the min is ans=arr[0]
        //after use linear search and update the ans
        int ans=arr[0];
        if(arr.length==0){
            return -1;
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
