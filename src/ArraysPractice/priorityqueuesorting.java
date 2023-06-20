package ArraysPractice;

import java.util.PriorityQueue;

import java.util.Queue;

public class priorityqueuesorting {
    public static void main(String[] args) {
        int arr[] = {-2,3,4,5};
        int arr2[] = {-4,-1,7,8,9};
        System.out.println(findMedian(arr,arr2));
    }
    public static int findMedian(int arr[],int arr2[]){
        Queue<Integer> ob = new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
            ob.add(arr[i]);
        }
        for(int i=0;i<arr2.length;i++){
            ob.add(arr2[i]);
        }
        System.out.println(ob);


        return 0;
    }
}
