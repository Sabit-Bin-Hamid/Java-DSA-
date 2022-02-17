package com.sourav.Problem_Solving.Recursion.Recursion_1;

public class binarySearchRoted {
    public static void main(String[] args) {
        int []a={5,6,7,8,9,1,2,3,4};
        System.out.println(findIndex(a,6,0,a.length-1));
    }
    static  int findIndex(int[]a,int t,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(t==a[m]){
            return m;
        }
        if(a[s]<=a[m]){
            if(t<=a[m] && t>=a[s]){
                return findIndex(a,t,s,m-1);
            }else
                return findIndex(a,t,m+1,e);
        }
        if(t>=a[m] && t<=a[e]){
            return findIndex(a,t,m+1,e);
        }
        return findIndex(a,t,s,m-1);
    }
}
