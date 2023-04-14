package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayLisImple {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int k=2;
        int maxCount =0;
        ArrayList<Integer> ob = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            ob.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){

            if(ob.get(i)==0 && k!=0){
                ob.set(i,1);
                k--;
            }


        }
        int count = maxCount(ob);
        if(maxCount <= count)
            maxCount = count;



    }
    public  static int maxCount(ArrayList<Integer> ob){
        int maxCount =0;
        int count =0;
        for(int i=0;i<ob.size();i++){
            if(ob.get(i) ==1){
                count++;
                if(maxCount<=count)
                    maxCount = count;
            }
            else
                count=0;
        }
        return maxCount;
    }
}
