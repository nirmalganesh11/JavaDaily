package StringsPractise;

import java.util.HashMap;
import java.util.Map;

public class countduplicates {
    public static void main(String[] args) {
        String str ="nirmalganeshyarramaneni";
        countDuplicates(str);
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
}
