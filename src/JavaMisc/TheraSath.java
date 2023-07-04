package JavaMisc;
import java.sql.SQLOutput;
import java.util.*;

public class TheraSath {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


    }
    public int maxofstable(int a,int b,int c,int d,int e){
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if(checkStable(a)){
            if(max<=a)
                max =a;
            if(min>=a)
                min =a;
        }
        if(checkStable(b)){
            if(max<=b)
                max =b;
            if(min>=b)
                min =b;
        }
        if(checkStable(c)){
            if(max<=c)
                max =c;
            if(min>=c)
                min =c;
        }
        if(checkStable(d)){
            if(max<=d)
                max =d;
            if(min>=d)
                min =d;
        }
        if(checkStable(e)){
            if(max<=e)
                max =e;
            if(min>=e)
                min =e;
        }
        return max+min;
    }
    public static boolean checkStable(int a){
        int temp =a;
        HashMap<Integer,Integer> ob = new HashMap<>();
        while(temp!=0){
            int rem = temp%10;
            if(ob.containsKey(rem))
                ob.put(rem,ob.get(rem) +1);
            else
                ob.put(rem,1);

        }
        int i =0;
        int max = 0;
        for(Map.Entry<Integer,Integer> obj:ob.entrySet()){
            int key = obj.getKey();
            int val = obj.getValue();
            if(i ==0)
                max = val;
            if(i!=0){
                if(max != val)
                    return false;
            }
        }
        return true;
    }
}

