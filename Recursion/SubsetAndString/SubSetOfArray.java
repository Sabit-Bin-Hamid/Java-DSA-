package com.sourav.Problem_Solving.Recursion.SubsetAndString;

import java.util.*;

public class SubSetOfArray {
    public static void main(String[] args) {
        int[]a={1,2,3};
        List<List<Integer>> ans=subset(a);
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
}
