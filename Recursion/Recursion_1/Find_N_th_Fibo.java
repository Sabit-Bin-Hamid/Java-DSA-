package com.sourav.Problem_Solving.Recursion.Recursion_1;

public class Find_N_th_Fibo {
    public static void main(String[] args) {
        int N_th_fibo=Fibo(10);
        System.out.println(N_th_fibo);
        Number(5);
        System.out.println();
        System.out.println("5=>>1: ");
        Number_rec(5);
        Number_rev1(5);
        System.out.println();
        System.out.print("sum= ");
        SumOfnumber(1,5,0);

        System.out.println();

        System.out.println(N_thFibo_Using_formula(10));
    }
    static int Fibo(int n){
        if(n<2){
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
    static int N_thFibo_Using_formula(int n){
        return (int)((Math.pow(((1+Math.sqrt(5)) /2),n)-Math.pow(((1-Math.sqrt(5))/2),n)) / Math.sqrt(5));
    }
    //print 5-1;
    static void Number(int n){
        for(int i=5;i>0;i--){
            System.out.println(i);
        }
    }
    static void Number_rec(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        Number_rec(n-1);
    }
    //sum of N neutral number LIKE(sum(1 to 5)==>1+...+5=15)
    static void SumOfnumber(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        SumOfnumber(i+1,n,sum);
    }
    static void Number_rev1(int n){
        if(n==0){
            return ;
        }
//        System.out.println(n);
        Number_rec(n-1);
        System.out.println(n);
    }
}
