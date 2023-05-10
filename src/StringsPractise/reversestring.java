package StringsPractise;

public class reversestring {

    public void reverseString(char[] s) {
        int n = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {

            char temp = s[n];
            s[n] = s[i];
            s[i] = temp;
            n--;
        }
        for (int i = 0; i < s.length; i++)
            System.out.print(s[i] + " ");
    }
}