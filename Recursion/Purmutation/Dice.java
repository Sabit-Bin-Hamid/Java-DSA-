package com.sourav.Problem_Solving.Recursion.Purmutation;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        int a=3;
        diceSubset("",a);
        System.out.print("IN ARRAY LIST: ");
        System.out.println(diceSubsetArray("",a));
        System.out.print("Count: ");
        System.out.println(diceSubsetcount("",a));
    }
    static void diceSubset(String  p,int up){
        if(up==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=up; i++) {
            diceSubset(p+i,up-i);
        }
    }
    static ArrayList<String> diceSubsetArray(String  p, int up){
        if(up==0){
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<String>();
        for (int i = 1; i <=6 && i<=up; i++) {
            ans.addAll(diceSubsetArray(p+i,up-i));
        }
        return ans;
    }
    static int diceSubsetcount(String  p,int up){
        if(up==0){
            return 1;
        }
        int count=0;
        for (int i = 1; i <=6 && i<=up; i++) {
           count=count+ diceSubsetcount(p+i,up-i);
        }
        return count;
    }

}
