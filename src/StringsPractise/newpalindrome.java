package StringsPractise;
import java.util.*;

public class newpalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();
            Map<Character, Integer> m = new HashMap<>();

            for (int i = 0; i < n / 2; i++) {
                char c = s.charAt(i);
                m.put(c, m.getOrDefault(c, 0) + 1);
            }

            if (m.size() >= 2)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }

}

