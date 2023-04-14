package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RepeatNumber {
    public static void main(String[] args) {
        int arr [] = {2,3,5,4,5,3,4};
        HashMap<Integer,Integer> ob = new HashMap<>();
        ArrayList<Integer> ob2 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(ob2.contains(arr[i])){
                ob2.remove(arr[i]);
            }
        }
    }
    public static int arrayMissing(int arr[]){
        Arrays.sort(arr);
        int meandiff=0;
        meandiff = arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
             int current =0;
             current = arr[i+1]-arr[i];
             if(current!=meandiff)
                 return arr[i]+1;

        }
        return 0;
    }
    //you are given an array with the elements where the elements of the array are 1,2,3,4
    public static int arraySum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum=sum+arr[i];

        if(countDigits(sum)==1)
            return sum;
        else{

        }
        return 0;

    }
    public static int countDigits(int a){
        int count =0;
        while(a>0){
            count++;
            a=a/10;
        }
        return count;
    }
    public static int digitsum(int a){
        int sum=0;
        while(a>0){
            sum=sum+a%10;
            a=a/10;
        }
        return sum;
    }

    //input string which contains random characters with a length between 0 - 1000 ,write a method to return
    //the first character in the string that doesnot repeat itself later on
    //str = {astfsbafdasfjdfsafnnunl}


    //you are given two binary trees merge both of them some nodes of the two trees overlap while others dont
    //five is left subchild of three right subchild of one

    //you are given a string apple computer break down the string and form words from it
    //three is the root node four is the left subchild five is the right subchild

}
