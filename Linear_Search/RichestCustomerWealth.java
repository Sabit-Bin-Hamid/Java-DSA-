package com.sourav.Problem_Solving.Linear_Search;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {5,1,3},
                {4,5,6,},
                {7,1,0},
                {10,10,10}
        };
        System.out.println(getWelth(arr));

    }
    static int getWelth(int[][]arr){
        int maxWelth= Integer.MIN_VALUE;
        for (int person=0;person < arr.length;person++){
            int sum=0;
            for(int accountWelth=0; accountWelth< arr[person].length;accountWelth++){
                sum+=arr[person][accountWelth];
            }
            if(sum > maxWelth){
                maxWelth=sum;
            }
        }
        return maxWelth;
    }

}
