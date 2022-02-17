package com.sourav.Problem_Solving.Recursion.Recursion_1;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[]a={1,3,5,7,9,10,14,16,19};
        int target=16;
        System.out.println(linearSearch_fromBack(a,target,a.length-1));
        System.out.println(linearSearch(a,18,0));
        System.out.println(linearSearch_findIndex_back(a,target,a.length-1));
        System.out.println(linearSearch_findIndex(a,target,0));

        System.out.println(findAllIndex(a,target,0,new ArrayList<>()));



    }

    static ArrayList<Integer> findAllIndex(int []a,int t,int index, ArrayList<Integer> list){
        if(a[index]==a.length){
            return list;
        }
        if(a[index]==t){
            list.add(index);
        }
        return findAllIndex(a,t,index+1,list);

    }

    static boolean linearSearch(int []a,int t,int index){
        if(index==a.length){
            return false;
        }
         return a[index]==t ||  linearSearch(a,t,index+1);
    }
    static boolean linearSearch_fromBack(int []a,int t,int index){
        if(index==-1){
            return false;
        }
        return a[index]==t ||  linearSearch(a,t,index-1);
    }
    static int linearSearch_findIndex_back(int []a,int t,int index){
        if(index==-1){
            return -1;
        }
        if(a[index]==t){
            return index;
        }else
            return linearSearch_findIndex(a,t,index-1);
    }
    static int linearSearch_findIndex(int []a,int t,int index){
        if(index==a.length){
            return -1;
        }
        if(a[index]==t){
            return index;
        }else
            return linearSearch_findIndex(a,t,index+1);
    }
//    static   ArrayList<Integer> list= new ArrayList<> ();
//    static void findAllIndex(int []a,int t,int index){
//        if(index==a.length){
//            return;
//        }
//        if(a[index]==t){
//            list.add(index);
//        }
//        linearSearch_findIndex(a,t,index+1);
//    }
}
