package StringsPractise;

import java.util.HashMap;
import java.util.Map;

public class countduplicates {
    public static void main(String[] args) {
        String str ="nirmalganeshyarramaneni";
        //countDuplicates(str);
        countduplicateswitharray(str);
    }
    public static void countDuplicates(String str){
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        for(char ch:str.toCharArray()){
            if(count.containsKey(ch))
               count.put(ch,count.get(ch)+1);
            else
                count.put(ch,1);
        }
        for(Map.Entry mapelement: count.entrySet()){
            char key = (char)mapelement.getKey();
            int hashval = (int)mapelement.getValue();
            if(hashval >1)
                System.out.print(key+" ="+hashval+" ");
        }
    }
    public static void countduplicateswitharray(String str){
        int chararr[] = new int [256];
        for(char ch: str.toCharArray()){
            chararr[ch]++;
        }
        for(int i =0;i<256;i++){
            if(chararr[i] >=1)
                System.out.println((char)i+" ="+chararr[i]);
        }
    }
}
