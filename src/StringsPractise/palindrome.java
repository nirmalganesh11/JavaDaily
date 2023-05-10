package StringsPractise;

public class palindrome {


        int isPalindrome(String S) {
            boolean flag = true;
            for(int i=0;i<S.length()/2;i++){
                if(S.charAt(i) != S.charAt(S.length()-1-i))
                    flag = false;
            }
            if(flag)
                return 1;
            else
                return 0;
        }
}
