package ArraysPractice;

import java.util.ArrayList;
import java.util.HashSet;

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

    public static int findUinionOfTwoArrays(int arr[] ,int arr2[]){
        int len1 = arr.length;
        int len2 = arr.length;
        int finalarray[] = new int [len1+len2];
        HashSet<Integer> ob = new HashSet<Integer>();
        for(int i:arr){
            ob.add(i);
        }
        for(int j:arr2){

            ob.add(j);
        }
        return ob.size();

    }
    public static int[] cyclicrotaion(int arr[]){
        int n = arr.length;
        int x = arr[n-1];
        for(int i=0;i<n-2;i++){
            arr[i+1] = arr[i];
        }
        arr[0] = x;
        return arr;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows= matrix.length;
        int flag =0;
        for(int i=0;i<rows;i++){
            if(binarySearchArray(matrix[i],target))
                flag=1;
        }
        if(flag ==0)
            return false;
        return true;
    }
    public boolean binarySearchArray(int arr[],int target){
        int l=0;
        int h = arr.length-1;
        int middle =(l+h)/2;
        while(l<h){
            if(arr[middle]>target){
                h = middle-1;
            }
            if(arr[middle]== target){
                return true;
            }
            else{
                l = middle +1;
            }
            middle = (l+h)/2;
        }
        return false;
    }







}
