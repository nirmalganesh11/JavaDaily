package StringsPractise;

import java.util.HashMap;

public class duplicatesinstring {
    public static void main(String[] args) {
        String arr = "nirmalganesh yarramaneni";
        System.out.println(countDuplicates(arr));
    }
    public static int countDuplicates(String arr){
        HashMap<Character,Integer> ob = new HashMap<Character,Integer>();
        for (char c:arr.toCharArray()){
            if(ob.containsKey(c))
                ob.replace(c,ob.get(c)+1);
            else
                ob.put(c,1);
        }

       return 1;
    }
}
