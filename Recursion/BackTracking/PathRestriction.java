package com.sourav.Problem_Solving.Recursion.BackTracking;

public class PathRestriction {
    public static void main(String[] args) {
        boolean [][]board={
                {true,true,true},
                {true,false,true},
                {true,true,true},

        };

        findPathWhenRestriction("",board,0,0);
//        int [][]arr={
//                {23,43,3},
//                {12,0,7},
//                {34,6,8}
//        };
//        System.out.println(arr[2][2]);


    }
    static void findPathWhenRestriction(String p,boolean[][]maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if(!maze[r][c]){
            return ;
        }
        if(r<maze.length-1){
            findPathWhenRestriction(p+"V",maze,r+1,c);
        }
//        if(r<maze.length-1 && c<maze[0].length-1){
//            findPathWhenRestriction(p+"D",maze,r+1,c+1);
//        }
        if(c<maze[0].length-1){
            findPathWhenRestriction(p+"H",maze,r,c+1);
        }
    }
}
