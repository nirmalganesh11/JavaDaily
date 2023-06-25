package ArraysPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rohithpractice {
    public static int findPIN(int input1,int input2,int input3,int input4){
        int totalval =1;
        List<Integer> ob = giveMaxAndMin(input1);
        totalval = totalval * (ob.get(0) * ob.get(1));
        //System.out.println(totalval);
        List<Integer> ob2 = giveMaxAndMin(input2);
        totalval = totalval * (ob2.get(0) * ob2.get(1));
        List<Integer> ob3 = giveMaxAndMin(input3);
        totalval = totalval * (ob3.get(0) * ob3.get(1));

        return totalval - input4;
    }
    public static List<Integer> giveMaxAndMin(int a){
        ArrayList<Integer> ob = new ArrayList<>();
        int max =0;
        int min =9;
        while(a>0){
            int rem = a%10;
            if(rem>=max)
                max = rem;
            if(rem <= min)
                min  = rem;
            a =a/10;
        }
        ob.add(min);
        ob.add(max);
        return ob;
    }
    public int findSum(int arr[]){
        Arrays.sort(arr);
        int sum =0;
        boolean foundfirst = false;
        for(int a:arr){
            if(foundfirst){
                sum = sum+ checkPrime(a);
                //System.out.print(a +" ");
                continue;
            }
            if(checkPrime(a) ==a)
                foundfirst = true;
        }
        if(foundfirst == false){
            for(int i=1;i<arr.length;i++)
                sum = sum+arr[i];
        }
        return sum;
    }
    public int checkPrime(int a){
        if(a==2)
            return 2;
        for(int i=2;i<a/2;i++){
            if(a%i ==0)
                return 0;
        }
        return a;
    }


    public static void main(String[] args) {
        int arr[] ={10,20,30,40};
       // System.out.println(findSum(arr));
        //System.out.println(findPIN(3521,2452,1352,38));
    }
}
