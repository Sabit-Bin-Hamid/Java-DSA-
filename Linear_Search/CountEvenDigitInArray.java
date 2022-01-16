package com.sourav.Problem_Solving.Linear_Search;

public class CountEvenDigitInArray {
    public static void main(String[] args) {
        int [] num={55,901,482,00,177,-33};
        System.out.println(countDigitInArray(num));
    }
    static int countDigitInArray(int [] nums){
        int count=0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int no_of_digit=countDigit(num);
        return no_of_digit % 2 == 0;
    }
    static int countDigit(int num){

        if(num < 0){
            num =num * -1;
        }
        int count=0;
        while(num > 0){
            count++;
            num=num/10;
        }
        return count;
    }
}
