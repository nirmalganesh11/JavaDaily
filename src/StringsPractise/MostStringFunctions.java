package StringsPractise;

import java.util.ArrayList;
import java.util.List;

public class MostStringFunctions {
    public static void main(String[] args) {
        String str ="nirmal";
        //List<String> ob = allPossibleSubstring(str);
        //System.out.println(6%3);
        System.out.println(rotate(str,50));
    }
    public static String rotate(String str, int k){
        int len = str.length();
        if(k>len)
            k =k%len;

        char arr[] = str.toCharArray();
        while(k-->0){
            char temp = arr[len-1];
            for(int i=len-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
        return String.valueOf(arr);
    }


    public static List<String> allPossibleSubstring(String str){
        List<String> ob = new ArrayList<String>();
        for(int i=0;i<str.length();i++){
            for(int j=str.length();j>=0;j--)
            {
                ob.add(str.substring(i,j));
            }
        }
        System.out.println(ob);
        return ob;
    }

}
