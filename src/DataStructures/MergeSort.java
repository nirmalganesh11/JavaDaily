package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0){
//            int size  = sc.nextInt();
//            int arr[] = new int [size];
//            for(int i=0;i<size;i++){
//                arr[i] = sc.nextInt();
//            }
//            mergeSort(arr);
//            printArray(arr);
//        }
        ArrayList<Integer> ab = new ArrayList<Integer>(100);
        Random rb  = new Random();
        for(int i=0;i<100;i++){
            int pick = rb.nextInt(10);
            ab.add(pick);
        }
        int[] arr = ab.stream().mapToInt(i -> i).toArray();
        //mergeSort(arr);
        printArray(arr);
        mergeSort(arr);
        printArray(arr);

    }
    public static void printArray(int arr[]){
        System.out.println(" ");
        for(int a:arr){
            System.out.print(a+"->");
        }
    }
    public static void mergeSort(int arr[]){
        int size  = arr.length;
        if(size<2)
                return;
        int mid = size/2;
        int left [] = new int [mid];
        int right[] = new int [size-mid];
        for(int i=0;i<mid;i++)
            left[i] =arr[i];
        for(int i=mid;i<size;i++)
            right[i-mid] = arr[i];

        mergeSort(left);
        mergeSort(right);

        merge(arr,left,right);
    }
    public static void merge(int arr[],int left[],int right[]){
        int leftSize = left.length;
        int rightSize = right.length;
        int i=0;
        int j=0;
        int k=0;
        while(i<leftSize && j<rightSize){
            if(left[i]<=right[j]) {
                arr[k] = left[i];
                i++;
            }
            else{
                arr[j] = right[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j<rightSize){
            arr[k] = right[j];
            k++;
            j++;
        }

    }

}
