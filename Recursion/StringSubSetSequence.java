package com.sourav.Problem_Solving.Recursion;

public class StringSubSetSequence {
    public static void main(String[] args) {
        String str="abcde";
        SubSetSeq("",str);
    }
    static void SubSetSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        SubSetSeq(p + up.charAt(0),up.substring(1));
        SubSetSeq(p ,up.substring(1));

    }
}
