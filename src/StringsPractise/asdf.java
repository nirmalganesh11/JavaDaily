package StringsPractise;

import java.util.*;

public class asdf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> v = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            v.add(scanner.nextInt());
            sum += v.get(i);
        }

        int ma = 0;
        Collections.sort(v);
        List<Integer> p = new ArrayList<>(Collections.nCopies(n + 1, 0));
        List<Integer> s = new ArrayList<>(Collections.nCopies(n + 1, 0));
        p.set(0, 0);

        for (int i = 1; i <= n; i++) {
            p.set(i, p.get(i - 1) + v.get(i - 1));
        }

        Collections.reverse(v);
        s.set(0, 0);

        for (int i = 1; i <= n; i++) {
            s.set(i, s.get(i - 1) + v.get(i - 1));
        }

        for (int i = 0; i <= k; i++) {
            int left = p.get(2 * i);
            int right = s.get(k - i);
            ma = Math.max(ma, sum - (left + right));
        }

        System.out.println(ma);
    }
}
