package com.sourav.Problem_Solving.Recursion.SubsetAndString;

import java.util.*;

public class SubSetOfArray {
    public static void main(String[] args) {
        int[]a={1,2,2};
        List<List<Integer>> ans=subsetDuplicate(a);
        for (List<Integer> list : ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subset(int[]arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetDuplicate(int[]arr){
        Arrays.sort(arr);
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i< arr.length;i++){
            start=0;

            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for (int j = start; j <n ; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
