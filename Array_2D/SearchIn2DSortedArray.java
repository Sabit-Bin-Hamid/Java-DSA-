package com.sourav.Problem_Solving.Array_2D;

import java.util.Arrays;

public class SearchIn2DSortedArray {
    public static void main(String[] args) {
        int[][] arr2D={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        int target=12;
        System.out.println(Arrays.toString(searchIn2DSorted(arr2D,target)));
    }
    public static int [] searchIn2DSorted(int[][]matrix,int target){
        int r=0;
        int col=matrix.length-1;
        while (r<matrix.length && col >=0){
            if(matrix[r][col]==target){
                return new int[]{r,col};
            }
            if(matrix[r][col]< target){
                r++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
