package com.sourav.Problem_Solving.Recursion.Purmutation;
import java.util.*;
public class PermutationSubset {
    public static void main(String[] args) {
        String a="abcde";
        Purmutation("",a);
        System.out.println(PurmutationList("",a));
        System.out.println(PurmutationCount("",a));
    }
    static void Purmutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f= p.substring(0,i);
            String l=p.substring(i,p.length());
            Purmutation(f+ch+l,up.substring(1));
        }
    }
    static ArrayList<String> PurmutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <=p.length() ; i++) {
            String f= p.substring(0,i);
            String l=p.substring(i,p.length());
            ans.addAll(PurmutationList(f+ch+l,up.substring(1)));
        }
        return ans;
    }
    static int PurmutationCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f= p.substring(0,i);
            String l=p.substring(i,p.length());
           count =count+ PurmutationCount(f+ch+l,up.substring(1));
        }
        return count;
    }


}
