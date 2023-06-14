package StringsPractise;

import javax.print.attribute.IntegerSyntax;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class stringrotations {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        //hashedarraylistmethod(str1,str2);
      //  System.out.println(queuemethod(str1,str2));
        System.out.println(isSubString(str1,str2));
    }
    public static void hashedarraylistmethod(String str1,String str2){
        boolean isRotation = false;
        ArrayList<Integer> ob = new ArrayList<Integer>();
        char firstchar =str1.charAt(0);
        for(int i=0;i<str2.length();i++) {
            if(firstchar == str2.charAt(i))
                ob.add(i);
        }
        for(int a:ob){
            isRotation = checkStrings(str1,str2,a);
            if(isRotation)
                break;
        }
        if(isRotation)
            System.out.println("it is a rotation");
        else
            System.out.println("not a rotation");

    }
    public static boolean checkStrings(String str1, String str2,int a){
        int size = str1.length();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) != str2.charAt((a+i)%size))
                return false;
        }
        return true;
    }
    public static boolean queuemethod(String str1,String str2){
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        if(str1.length() != str2.length())
            return false;
        for(int i=0;i<str1.length();i++) {
            q1.add(str1.charAt(i));
            q2.add(str2.charAt(i));
        }
        int k = str1.length();
        while(k>0){
            char ch = q2.peek();
            q2.remove();
            q2.add(ch);
            if(q1.equals(q2))
                return true;
        }
        return false;
    }
    public static boolean isSubString(String str1,String str2){
        str1 = str1+str1;
        return str1.contains(str2);
    }
}
