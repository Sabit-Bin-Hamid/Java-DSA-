package com.sourav.Problem_Solving.Linear_Search;

public class FindingCharacter {
    public static void main(String[] args) {
        String name="sourav";
        char target='o';
        System.out.println(search(name,target));
    }
    public static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(target==ch)
                return true;
        }
        return false;
    }
    //also can use this
//    public static boolean search1(String str,char target){
//        if(str.length() == 0){
//            return false;
//        }
//        for(int i=0;i<str.length();i++){
//            if(target==str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }
}
