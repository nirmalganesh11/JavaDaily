package ArraysPractice;

import java.util.Arrays;
import java.util.PriorityQueue;

public class twentythjunearrays {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 6, 12, 15};
        int[] arr2 = {12, 10, 6, 3, 4};
        System.out.println(findmedianpriority(arr1, arr2));

    }

    public static int findMedain(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int totalsize = m + n;
       // System.out.println(totalsize);
        int finalarr[] = new int[totalsize];
        for (int i = 0; i < totalsize; i++) {
            if (i >= m) {
                finalarr[i] = arr2[i - m];
                continue;
            }
            finalarr[i] = arr1[i];
        }
//        for(int a:finalarr)
//            System.out.print(a+" ");
//        for(int i=0;i<totalsize;i++)
//            System.out.print(finalarr[i]+" ");
        Arrays.sort(finalarr);

        if (totalsize % 2 != 0) {
            return finalarr[totalsize / 2];
        }
        int onevalue = finalarr[totalsize/2];
        int twovalue = finalarr[totalsize/2 -1];
        int avg = (onevalue+twovalue) /2;
        return avg;
    }
    public static int findmedianpriority(int arr1[],int arr2[]){
        PriorityQueue<Integer> ob = new PriorityQueue<>();
        int n = arr1.length + arr2.length;
        for(int i=0;i<n;i++){
            if(i >=arr1.length){
                ob.add(arr2[i-arr1.length]);
                continue;
            }
            ob.add(arr1[i]);
        }
        //System.out.println(ob);
        for(int  i=0;i<n;i++){
            System.out.print(ob.poll() +" ");
        }

        return 1;
    }


}
