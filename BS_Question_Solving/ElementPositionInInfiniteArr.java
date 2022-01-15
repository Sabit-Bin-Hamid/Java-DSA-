package com.sourav.Problem_Solving.BS_Question_Solving;

public class ElementPositionInInfiniteArr {
    //find the position of a number in a infinite array
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,11,44};
        int target=3;
        int ans=ans(arr,target);
        System.out.println(ans);
    }

    public static int ans(int[]arr,int target){
        int start=0;
        int end =1;
        while(target>arr[end]){
            int temp=end+1;//this is my new start
            end=end+(end-start+1)*2;
//            end=end+(end-start+1)*2;
            start=temp;
        }
        int myans=binarySearch(arr,target,start,end);
        return myans;
    }
    public static int binarySearch(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
