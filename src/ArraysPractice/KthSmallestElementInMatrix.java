package ArraysPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallestElementInMatrix {
    public static void main(String[] args) {
        int mat[][] = new int [][] {{16, 28, 60, 64},
                {22, 41, 63, 91},
                {27, 50, 87, 93},
                {36, 78, 87, 94 }};
        int kthEle = 7;
        System.out.println(findKthSmallest(mat,kthEle));

    }
    public static int findKthSmallest(int mat[][],int kthEle){
        List<Integer> ob = new ArrayList<Integer>();
        int rows = mat.length;
        int columns = mat[0].length;
        for(int i=0;i<rows;i++)
            for(int j=0;j<columns;j++)
                ob.add(mat[i][j]);

        Collections.sort(ob);
        return ob.get(kthEle-1);
    }
}
//best codee
//import java.util.*;
//
//public class KthSmallestInMatrix {
//
//    public static int kthSmallest(int[][] matrix, int k) {
//        int rows = matrix.length;
//        int columns = matrix[0].length;
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//        // Iterate through all elements of the matrix and add them to the heap
//        for(int i = 0; i < rows; i++) {
//            for(int j = 0; j < columns; j++) {
//                minHeap.offer(matrix[i][j]);
//                // If the size of the heap becomes greater than k, remove the minimum element
//                if(minHeap.size() > k) {
//                    minHeap.poll();
//                }
//            }
//        }
//        // The kth smallest element will be the minimum element in the heap
//        return minHeap.peek();
//    }
//
//    public static void main(String[] args) {
//        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
//        int k = 8;
//        int kthSmallestElement = kthSmallest(matrix, k);
//        System.out.println(k + "th smallest element in the matrix is: " + kthSmallestElement);
//    }
//}
