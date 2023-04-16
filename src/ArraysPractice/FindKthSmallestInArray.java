package ArraysPractice;



import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthSmallestInArray {
    public static void main(String[] args) {
        int arr[] = new int []{7, 10, 4, 3, 20, 15};
        System.out.println(kthSmallest(arr));
    }
    public static int kthSmallest(int arr[],int k){
        Queue<Integer> ob = new PriorityQueue<Integer>();
        if(ob.size() == k)


    }
}
