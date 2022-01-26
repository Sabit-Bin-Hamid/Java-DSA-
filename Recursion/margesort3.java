package com.sourav.Problem_Solving.Recursion;

import java.util.Arrays;

public class margesort3 {

    public static void divide(int[]a,int si,int ei){
        if(si>=ei){
            return;
        }
        int m=si+(ei-si)/2;
        divide(a,si,m);
        divide(a,m+1,ei);
        conqure(a,si,m,ei);

    }

    private static void conqure(int[] a, int si, int m, int ei) {
        int[] mix=new int[ei-si+1];
        int indx1=si;
        int indy2=m+1;
        int x=0;

        while(indx1<=m && indy2<=ei){
            if(a[indx1]<=a[indy2]){
                mix[x++]=a[indx1++];
            }else{
                mix[x++]=a[indy2++];
            }
        }
        while(indx1<=m){
            mix[x++]=a[indx1++];
        }
        while(indy2<=ei){
            mix[x++]=a[indy2++];
        }
        for(int i=0,j=si;i<mix.length;i++,j++){
            a[j]=mix[i];
        }

    }

    public static void main(String[] args) {
//        int[]arr={6,3,9,5,2,8};
        int[]arr={43,0,11,33,55,66,77,3434,1223,5341,111,11111,3435,31234354,6545454,657687989,31225,80897875,987654,765432,987643,233323,43545,57745,3233545,65767565,9,8,7,6,5,4,3,2,1,45,67,34,23,45,67,78,3,543};
        int n=arr.length-1;
        divide(arr,0,n);
        System.out.println(Arrays.toString(arr));
    }
}
