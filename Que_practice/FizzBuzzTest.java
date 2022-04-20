package com.sourav.Problem_Solving.Que_practice;

public class FizzBuzzTest {
    public static void main(String args[]){
        test();
    }
    static void test(){
        for (int i=0;i<=50;i++){
            if(i%(3*5)==0){
                System.out.println("FizzBuzz");

            }else if(i%5==0){
                System.out.println("Buzz");
            }else if (i%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}


