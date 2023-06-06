package ArraysPractice;

import java.util.ArrayList;

public class classnumber {
    public static void main(String[] args) {
       int arr[] = {0,2,1,2,0};
        sortArrayTwoArraysAndOnes(arr);
    }
    public static void sortArrayTwoArraysAndOnes(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length-2;i++){
//                if(arr[i]>arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//            ArrayList<Integer> zerolist = new ArrayList<Integer>();
//            ArrayList<Integer> oneslist = new ArrayList<Integer>();
//            ArrayList<Integer> twolist = new ArrayList<Integer>();
            int zeroes =0;
            int ones=0;
            int twos =0;
            for(int i: arr){
                if(i == 0)
                    zeroes++;
                if(i==1)
                    ones++;
                if(i==2)
                    twos++;
              }
            int i=0;
            while(i!=arr.length){
                if(zeroes>0)
                {
                    arr[i]=0;
                    zeroes--;
                    i++;
                }
                if(ones>0 && zeroes ==0){
                    arr[i] = 1;
                    ones--;
                    i++;
                }
                if(twos >0 && zeroes ==0 && ones ==0){
                    arr[i] = 2;
                    twos--;
                    i++;
                }
            }





    }
    public static int[] sortTheArrayBasedOnNegatives(int arr[]){
        int negativecounter =0;
        int positivecounter=arr.length-1;
        int len = arr.length;
        int nextArray[] = new int[len];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) {
                nextArray[negativecounter] = arr[i];
                negativecounter++;
            }
            if(arr[i] >=0){
                nextArray[positivecounter] = arr[i];
                positivecounter--;
            }
        }
        return nextArray;
    }
    public static int[] sorttheArraywithconstantspace(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;

            }
        }
        return arr;
    }
    public static void sortthearraywithtwopointers(int arr[]){
        int left =0;
        int right =arr.length-1;
        while(left <right){
            if(arr[left]<0 && arr[right]<0){
                left++;
            }
            if(arr[left]>0 && arr[right]<0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            if(arr[left]<0 && arr[right]>0){
                right--;
            }
            if(arr[left] >0 && arr[right]>0){
                left++;
                right--;
            }
        }


    }





}
