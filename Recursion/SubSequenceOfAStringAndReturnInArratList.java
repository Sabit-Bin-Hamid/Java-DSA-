package com.sourav.Problem_Solving.Recursion;

import java.util.*;

public class SubSequenceOfAStringAndReturnInArratList {
    public static void main(String[] args) {
        String str="abc";

        System.out.println(SubsequenceReturn("",str));
    }
    static ArrayList<String> SubsequenceReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = SubsequenceReturn(p + up.charAt(0),up.substring(1));
        ArrayList<String> right = SubsequenceReturn(p ,up.substring(1));
        right.addAll(left);
        return right;
    }
}
