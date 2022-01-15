package com.sourav.Problem_Solving.BS_Question_Solving;
public class mountainArray {
    //find peak in a mountain array or bitonic array
    //arr={0,2,1,0} ans is =2
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,1};
        int myans=findPeak(arr);
        System.out.print(myans);
    }
    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                //this mid may be the ans so i take end= mid;
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;//or end cz both are equal
    }
}
