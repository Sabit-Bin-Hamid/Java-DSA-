package com.sourav.Problem_Solving.Recursion.BackTracking;

public class AllPath {
    public static void main(String[] args) {
        boolean [][]board={
                {true,true,true},
                {true,true,true},
                {true,true,true},
                {true,true,true},
                {true,true,true},

        };
        allpath("",board,0,0);
        System.out.println("Total path: "+allpathcount(board,0,0));
    }
    static void allpath(String p,boolean[][]maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }


        if(!maze[r][c]){
            return ;
        }
        // i am cosidering this path in my path
        maze[r][c]=false;
        if(r<maze.length-1){
            allpath(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allpath(p+"R",maze,r,c+1);
        }
        if(r>0){
            allpath(p+"U",maze,r-1,c);
        }
        if(c>0){
            allpath(p+"L",maze,r,c-1);
        }
        //this line is where the function will be over
        //so before the function get removed all removed that were made by the function
        maze[r][c]=true;


    }
    static int  allpathcount(boolean[][]maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            return 1;
        }

        if(!maze[r][c]){
            return 0;
        }
        int D=0,R=0,U=0,L=0;
        // i am cosidering this path in my path
        maze[r][c]=false;
        if(r<maze.length-1){
             D=allpathcount(maze,r+1,c);
        }
        if(c<maze[0].length-1){
             R=allpathcount(maze,r,c+1);
        }
        if(r>0){
             U=allpathcount(maze,r-1,c);
        }
        if(c>0){
             L=allpathcount(maze,r,c-1);
        }
        //this line is where the function will be over
        //so before the function get removed all removed that were made by the function
        maze[r][c]=true;
        return D+R+U+L;
    }
}
