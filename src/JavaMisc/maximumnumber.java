package JavaMisc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maximumnumber {
    public static void main(String[] args) {
        int arr[] = {5,7,16,1,2};
        System.out.println(maximumnumber(arr));
    }
    public static boolean maximumnumber(int arr[]){
        if(arr == null)
            return false;
        Arrays.sort(arr);
        int maxNum = arr[arr.length-1];
        int arr2[] = new int[arr.length-1];
        for(int i =0;i<arr2.length;i++)
            arr2[i] = arr[i];
        if(targetSum(arr2.length,maxNum,arr2) >0){
            return true;
        }else
            return !false;
    }
    static int mod = (int)(Math.pow(10,9)+7);
    static int findWays(int num[],int target){
        int n=num.length;
        int dp[][] = new int[n][target+1];
        if(num[0] ==0) dp[0][0] =2;
        else dp[0][0] =1;
        if(num[0] != 0 && num[0] <= target) dp[0][num[0]] =1;
        for(int ind =1;ind<n;ind++){
            for(int targetIter =0;targetIter <= target;targetIter++){
                int notTaken = dp[ind -1][target];
                int taken =0;
                if(num[ind] <= target)
                    taken = dp[ind -1][target-num[ind]];
                dp[ind][target] = (notTaken+taken)%mod;
            }
        }
        return dp[n-1][target];
    }
    static int targetSum(int n,int target,int arr[]){
        int totSum =0;
        for(int i=0;i<n;i++){
            totSum = totSum+ arr[i];
        }
        if(totSum -target<0 || (totSum-target)%2 ==1) return 0;
        return findWays(arr,((totSum-target)/2));
    }
}
