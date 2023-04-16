package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayOrString {
    public static void main(String[] args) {
        String str = "nirmalganesh";
        int arr[] = new int []{1,2,3,4,5,6,7,8,9};
        System.out.println(reverse(arr));
    }
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length()/2;i++){
            char c = sb.charAt(i);
            char last =sb.charAt(sb.length()-i-1);
            sb.setCharAt(i,last);
            sb.setCharAt(sb.length()-i-1,c);
        }
        return sb.toString();
    }
    public static List<Integer> reverse(int arr[]){
        List<Integer> ob= new ArrayList<Integer>();
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for(int a:arr)
            ob.add(a);
        return ob;
    }
}
