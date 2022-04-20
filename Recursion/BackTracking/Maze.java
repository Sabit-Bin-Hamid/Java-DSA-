package com.sourav.Problem_Solving.Recursion.BackTracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String args[]){
        System.out.println(count(3,3));
        System.out.println("Count Path in Diagola Vertical Horizontal axis");
        System.out.println(countLeftRightDiagonal(3,3));
        FindAllPath("",3,3);
        System.out.println(FindAllPathInArray("",3,3));
        System.out.println("Print Path in Diagola Vertical Horizontal axis");
        System.out.println(FindAllPathInArrayDiagonal("",3,3));
        System.out.println("Count Path in Diagola Vertical Horizontal axis");
        System.out.println(CountPathDiagolaVerticalHorizontal(3,3));
    }
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);

        int right=count(r,c-1);
        return left+right;
    }
    static int countLeftRightDiagonal(int r,int c){
        if(r==1 || c==1 || (r==1 & c==1) ){
            return 1;
        }
        int left=countLeftRightDiagonal(r-1,c);
        int diagonal=countLeftRightDiagonal(r-1,c-1);
        int right=countLeftRightDiagonal(r,c-1);
        return left+right+diagonal;
    }
    static void FindAllPath(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            FindAllPath(p+"D",r-1,c);
        }
        if(c>1){
            FindAllPath(p+"R",r,c-1);
        }

    }

    static ArrayList<String> FindAllPathInArray(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans =new ArrayList<>();
        if(r>1){
            ans.addAll( FindAllPathInArray(p+"D",r-1,c));
        }
        if(c>1){
            ans.addAll(FindAllPathInArray(p+"R",r,c-1));
        }
        return ans;
    }

    static ArrayList<String> FindAllPathInArrayDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans =new ArrayList<>();
        if(r>1 && c>1){
            ans.addAll(FindAllPathInArrayDiagonal(p+"D",r-1,c-1));
        }
        if(r>1){
            ans.addAll( FindAllPathInArrayDiagonal(p+"V",r-1,c));
        }

        if(c>1){
            ans.addAll(FindAllPathInArrayDiagonal(p+"H",r,c-1));
        }
        return ans;
    }

    static int CountPathDiagolaVerticalHorizontal(int r, int c){
        if(r==1 || c==1 || (r==1 & c==1)){
            return 1;
        }
         int vertical=0,horizontal=0,diagonal=0;
        if(r>1){
             vertical=CountPathDiagolaVerticalHorizontal(r-1,c);
        }
        if(c>1){
             horizontal=CountPathDiagolaVerticalHorizontal(r,c-1);
        }
        if(r>1 && c>1){
             diagonal=CountPathDiagolaVerticalHorizontal(r-1,c-1);
        }
        return vertical+horizontal+diagonal;
    }
}
