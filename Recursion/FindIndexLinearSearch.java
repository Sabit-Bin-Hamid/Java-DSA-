package com.sourav.Problem_Solving.Recursion;

import java.util.ArrayList;

public class FindIndexLinearSearch {
    public static void main(String[] args) {
        int[]arr = {1,3,4,5,4,8,9,4,3};
        int target=4;
        System.out.println(elementFound(arr,target,0));
        System.out.println(searchINdex(arr,target,0));
        findAllIndex(arr,target,0);
        System.out.println(list);
        System.out.println(findAllIndex1(arr,target,0,new ArrayList<Integer>()));
        System.out.println(findAllIndex3(arr,target,0));

    }
    //find INDEX in array if exist otherwise return False
    public static int searchINdex(int[]arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchINdex(arr,target,index+1);
    }

    //check Element is present or not in array
    static boolean elementFound(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target ||elementFound(arr,target,index+1);
    }
    //search all index for same target in array
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int []arr, int target, int index){
        if(index==arr.length-1){
            return ;
        }
        if(arr[index]==target){
             list.add(index);
        }
         findAllIndex(arr,target,index+1);
    }

    //search all index for same target in array

    static ArrayList<Integer> findAllIndex1(int[]arr,int target,int index,ArrayList <Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex1(arr,target,index+1,list);
    }
    static  ArrayList<Integer> findAllIndex3(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
         ArrayList<Integer> AnsBelow=findAllIndex3(arr,target,index+1);
         list.addAll(AnsBelow);
         return list;
    }

}
