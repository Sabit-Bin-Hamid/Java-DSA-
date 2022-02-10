package com.sourav.Problem_Solving.Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("1.");
//---------------------------------
        int row=4;
        int col=5;
        Pattern1(row,col);
//        ---------------------------------------
        System.out.println();
//        ---------------------------------------
        System.out.println(2.);
        pattern2(row,col);
        System.out.println();
//        --------------------------------------
        System.out.println(3.);
        Pattern3(row,col);
        System.out.println();
//        ________________________________
//        ___________________________
        System.out.println("4");
        Pattern4(row,col);

//        ----------------------------
    }
    static void Pattern1(int row,int col){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int row, int col){
        for (int i = 1; i <=row ; i++) {
            for(int j=1;j<=col ;j++){
                if(i==1 || j==1|| i==row ||j==col){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void Pattern3(int row,int col){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern4(int row,int col){
        for (int i = row; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
