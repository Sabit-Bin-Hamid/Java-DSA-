package com.sourav.Problem_Solving.Recursion.SubsetAndString;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        String str="ab";
//        getSubset("",str);
        System.out.println(GetSubset("",str));
    }
    static  void getSubset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        getSubset(p,up.substring(1));
        getSubset(p+ch,up.substring(1));

    }
    static ArrayList<String> GetSubset(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);

            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left= GetSubset(p+ch,up.substring(1));
        ArrayList<String> right=  GetSubset(p,up.substring(1));
        left.addAll(right);
        return left;
    }

}
