package com.sourav.Problem_Solving.Recursion.Recursion_1;
import java.util.ArrayList;
public class findIndex {
    public static void main(String[] args) {
        int[]a={1,8,9,9,10,14};
        int target=9;
        System.out.println(FindIndex_X(a,target,0,new ArrayList<>()));
        System.out.println(findINDEX(a,target,0));
    }
    static ArrayList<Integer> FindIndex_X(int[]a,int t,int index,ArrayList<Integer> list){
        if(index==a.length){
            return list;
        }
        if(a[index]==t){
            list.add(index);
        }
        return FindIndex_X(a,t,index+1,list);
    }
    static ArrayList<Integer> findINDEX(int []a,int t,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==a.length){
            return list;
        }
        if(a[index]==t){
            list.add(index);
        }
        ArrayList<Integer> addAns=findINDEX(a,t,index+1);
        list.addAll(addAns);
        return list;
    }

}
