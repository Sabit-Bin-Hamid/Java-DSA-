package com.sourav.Problem_Solving.Recursion.Purmutation;

import java.util.ArrayList;

public class NumberPad {
    public static void main(String[] args) {
        String number="12";
        pad("",number);
        System.out.println("store in Array list");
        System.out.println(padArrayList("",number));
        System.out.println(padCount("",number));
    }
    static  void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit= up.charAt(0)-'0';
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch= (char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }


    static ArrayList<String> padArrayList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit= up.charAt(0)-'0';
        ArrayList<String> ans=new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch= (char)('a'+i);
            ans.addAll(padArrayList(p+ch,up.substring(1)));
        }
        return ans;
    }

    static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int digit= up.charAt(0)-'0';
        ArrayList<String> ans=new ArrayList<>();
        int count=0;
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch= (char)('a'+i);
            count=count+(padCount(p+ch,up.substring(1)));
        }
        return count;
    }
}
