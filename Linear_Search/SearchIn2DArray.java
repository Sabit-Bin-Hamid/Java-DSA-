package com.sourav.Problem_Solving.Linear_Search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][]arr={{9, 20, 30, 40},
                    {15, 2, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 0, 50},
                    {50, 60, 70, 60}};
        int target=50;
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println("max value: "+max(arr));
        System.out.println("min value: "+min(arr));
    }
   //find elements position in 2d arrays
    static  int[] search(int[][]arr,int target){
        for (int row=0;row<arr.length;row++){
            for (int col=0;col < arr[row].length;col++){
                if(target==arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //FIND MAX value in  2D arrays
    static int max(int[][]arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
    //FIND MIN value in  2D arrays
    static int min(int[][]arr){
        int min=Integer.MAX_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<min){
                    min=arr[row][col];
                }
            }
        }
        return min;
    }
}
