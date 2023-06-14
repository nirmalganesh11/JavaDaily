package StringsPractise;

import java.util.ArrayList;
import java.util.List;

public class stringlonges {
    public static void main(String[] args) {
        String s = "nirmalganeshyarramaneni";
        int maxcount =0;
        String shit ="";
        for(String sst: allpossiblesubstrings(s)){
            if(isPalindrome(sst)) {
                maxcount = Math.max(sst.length(), maxcount);
                if(sst.length() ==maxcount)
                    shit=sst;
            }
        }
        System.out.println(maxcount+" "+ shit);
       // System.out.println(isPalindrome("aabaab"));

    }
    public static List<String> allpossiblesubstrings(String str){
        ArrayList<String> sb = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                String temp = str.substring(i,j);
                sb.add(temp);
            }
        }
        return sb;
    }
    public static boolean isPalindrome(String str){
        int last = str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(last))
                return false;
            last--;
        }
        return true;
    }
}
