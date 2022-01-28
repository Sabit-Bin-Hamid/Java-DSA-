package com.sourav.Problem_Solving.Recursion;

public class skipACharacter {
    public static void main(String[] args) {
        skip("","abaccad");
        System.out.println(skip1("abaccad"));
        System.out.println(skip_with_String("abaappleccad"));
        System.out.println(skipAppNotApple("abaappleappccad"));

    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skip1(up.substring(1));
        }else{
            return ch+skip1(up.substring(1));
        }
    }
    static String skip_with_String(String up){
        if(up.isEmpty()){
            return "";
        }
        String ch="";
        if(up.startsWith("apple")){
            return skip_with_String(up.substring(5));
        }else{
            return up.charAt(0)+skip_with_String(up.substring(1));
        }
    }

    //now only skip this app when it is not apple
    static  String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0)+ skipAppNotApple(up.substring(1));
        }
    }
    

}
