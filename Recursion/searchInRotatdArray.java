package com.sourav.Problem_Solving.Recursion;

import java.awt.geom.Area;

public class searchInRotatdArray {
    public static void main(String[] args) {
        int[]a={5,6,7,8,9,1,2,3};
        int target=9;
        int ans=search(a,target,0,a.length-1);
        System.out.println(ans);
    }
    static int search(int [] a,int target,int s, int e){
        if(s > e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(target==a[m]){
            return m;
        }
        if(a[s]<=a[m]){
            if(target>=a[s] && target<=a[e]){
                return search(a,target,s,m-1);
            }else
                return search(a,target,m+1,e);
        }
        if(target>=a[m] && target<=a[e]){
            return search(a,target,m+1,e);
        }
        return search(a,target,s,m-1);
    }
}
