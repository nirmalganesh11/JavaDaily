package JavaMisc;

import java.util.*;

public class todayalljava {
    public static void main(String[] args) {
        String a ="hit";
        String b ="cog";
        String arr[] ={"hot","dot","dog","lot","log"};
        System.out.println(wordladder1(a,b,arr));
    }
    class wordNode{
        String word;
        int steps;
        public wordNode(String word,int steps){
            this.word = word;
            this.steps = steps;
        }
    }
    public static int wordladder1(String a,String b,String arr[]){
        Map<String,Integer> ob = new HashMap<>();
        for(String s:arr)
            ob.put(s,1);
        ob.put(b,1);

        int steps =0;
        String str =a;
            char chararr[] = str.toCharArray();
            loops:
            for (int i = 0; i < a.length(); i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    if (chararr[i] != c)
                        chararr[i] = c;
                    String newString = new String(chararr);
                    if (newString.equals(b))
                        return steps;
                    if (ob.containsKey(newString)) {
                        steps++;
                        str = newString;
                        continue loops;
                    }
                }

            }
            //continue loops;
        return  steps;


    }
    public static int returnvalueofarray(char arr[]){
        Stack<Integer>ob = new Stack<Integer>();
        for(int i=0;i<arr.length;i++){
            int num = (int)arr[i];
            if(num>=48 && num<=57)
                ob.add(Character.getNumericValue(arr[i]));
            else{
                int num1 = ob.pop();
                int num2 = ob.pop();
                if(arr[i] == '+'){
                    ob.push((num1+num2));
                }

                else if (arr[i] == '-')
                    ob.push((num1-num2));
                else if(arr[i] == '*')
                    ob.push((num1*num2));
                else if(arr[i] == '/')
                    ob.push((num1/num2));
                else
                    return 0;
            }
        }
        return ob.pop();
    }
    public static boolean ismorphicCheck(String a,String b){
        Map<Character,Character> ob  = new HashMap<>();
        if(a.length() != b.length())
            return false;
        for(int i=0;i<a.length();i++){
            if(ob.containsKey(a.charAt(i))){
                char c = ob.get(a.charAt(i));
                //System.out.println(c);
                if(c != b.charAt(i))
                    return false;
                else
                    continue;
            }
            ob.put(a.charAt(i),b.charAt(i));

        }
        if(sameCharacterMap(ob))
            return true;
        return false;
    }
    public static boolean sameCharacterMap(Map<Character,Character> ob){
        //ArrayList<Character> arj = new ArrayList<>();
        HashSet<Character>  hs = new HashSet<>();
        for(Map.Entry<Character,Character> obj:ob.entrySet()){
            Character value = obj.getValue();
            hs.add(value);
        }
        if(hs.size() != ob.size())
            return false;
        return true;
    }

}
