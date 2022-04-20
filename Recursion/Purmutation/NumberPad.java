package com.sourav.Problem_Solving.Recursion.Purmutation;

import java.util.*;

public class NumberPad {
    public static void main(String[] args) {
        String number="23";
//        pad("",number);
        System.out.println("store in Array list");
        System.out.println(letterCombinations1(""));
//        System.out.println(padCount("",number));
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

    public static List<String> letterCombinations(String digits) {
        return helper1("", digits);
    }

    static ArrayList<String> helper1(String p, String up){
        if(up==""){
            ArrayList<String> list=new ArrayList<>();
            return list;
        }
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit= up.charAt(0)-'0';
        ArrayList<String> ans=new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch= (char)('a'+i);
            ans.addAll(helper1(p+ch,up.substring(1)));
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

    public static List<String> letterCombinations1(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return result;
        }
        return helper("", digits);
    }
    public static List<String> helper(String p, String up){

        if(up.isEmpty()){
            List<String> list = new ArrayList<>();;
            list.add(p);
            return list;
        }
        int digit= up.charAt(0)-'0';
        List<String>  ans=new ArrayList<>();
        for (int i = (digit-2)*3; i <(digit-1)*3 ; i++) {
            char ch= (char)('a'+i);
            ans.addAll(helper(p+ch,up.substring(1)));
        }
        return ans;
    }
}
