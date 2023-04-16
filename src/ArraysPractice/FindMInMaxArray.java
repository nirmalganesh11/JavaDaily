package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMInMaxArray {
    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        System.out.println(findMinMax(arr));
    }
    public static List<Integer> findMinMax (int arr[]){
        List<Integer> ob = new ArrayList<Integer>();
        Arrays.sort(arr);
        ob.add(arr[0]);
        ob.add(arr[arr.length-1]);
        return ob;
    }
}
