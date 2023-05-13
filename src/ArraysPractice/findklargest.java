package ArraysPractice;

import java.util.*;

public class findklargest {
    public int findMaxK(int[] nums) {
//        int max =0;
//        HashMap<Integer,Integer> ob  = new HashMap<>();
//        for(int a: nums){
//            if(!ob.containsKey(a))
//                ob.put(a,1);
//
//            a = -a;
//
//            if(ob.containsKey(a))
//                max = Math.max(max,a);
//
//        }
//        return max;
        HashSet<Integer> ob = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
            ob.add(nums[i]);
        int res =-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0&& ob.contains(-nums[i]))
                res =nums[i];
        }
        return res;

    }
    public int countDistinctIntegers(int[] nums) {
        int n2 = nums.length;
        int n = 2*nums.length;
        int arr[] = new int [n];
        int j =0;
        for(int i =0;i<n;i++){
            if(i >n2-1) {
                arr[i] = reverse(nums[j])
                        j++;
            }
            arr[i] = nums[i];
        }
        return countdist(arr);
    }
    public int countdist(int arr[]){
        HashSet<Integer> ob =new HashSet<>();
        for(int a: arr){
            ob.add(a);
        }
        return ob.size();
    }
    public int reverse(int a){
        String s ="";
        while(a>0){
            int c = a%10;
            s =s + Integer.toString(c);
            a =a/10;
        }
        int d =Integer.parseInt(s);
        return d;
    }
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<num;i++){
            if(num == num + reverse(num))
                return true;
        }
        return false;


    }
    public long countSubarrays(int[] nums, int minK, int maxK) {
        List<List<Integer>> subarr = new ArrayList<List<Integer>>();
        int count =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                List<Integer> ob =new ArrayList<Integer>();
                for(int k =i;k<=j;k++)
                    ob.add(nums[k]);
                if(sayyes(ob,maxK,minK))
                    count++;
                subarr.add(ob);
            }
        }
        return  count;

    }
    public boolean sayyes(List<Integer> ob,int maxk,int mink){
        int maxnum =Integer.MIN_VALUE;
        int minnum =Integer.MAX_VALUE;
        for(int a:ob){
            if(a>=maxnum)
                maxnum = a;
            if(a<=minnum)
                minnum = a;
        }
        if(maxk == maxnum && mink == minnum)
            return true;
        else
            return false;
    }



}
