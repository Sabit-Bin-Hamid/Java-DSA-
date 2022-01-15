package com.sourav.Problem_Solving.BS_Question_Solving;

public class findsmallestletterGraterThnTargte {
    //finding the smallest latter that is grater than the target
    public static void main(String[] args) {

        char[] letter={'a','c','f','g','k'};
        System.out.println(letter.length);
        char target='a';
        char result=smallestletter(letter,target);
        System.out.println(result);
    }
    /***
     * Find Smallest Letter Greater Than Target
     * Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
     * Note that the letters wrap around.
     * For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
     */
    public static char smallestletter(char[] letter,char target) {
        int start =0;
        int end=letter.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target< letter[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letter[start % letter.length];
    }
}
