package com.sourav.Problem_Solving.Linear_Search;

public class EvenDigit {
    //1295. Find Numbers with Even Number of Digits
    public static void main(String[] args) {
        int [] num={55,901,482,00,177};
        System.out.println(evenCounter(num));
    }
    static int evenCounter(int[]arr){
        int counter=0;
        for(int num : arr){
            if(Even(num)){
                counter++;
            }
        }
        return counter;
    }
    static boolean Even(int num){
       int numberDegit=countDigit(num);
       return numberDegit % 2==0;
//       if(numberDegit/2==0){
//           return true;
//       }
//       return false;
    }
    static int countDigit(int number){
        if(number < 0)
            number=number * -1;
        int count=0;
        while(number > 0){
            count++;
            number=number/10;
        }
        return count;
    }
}
