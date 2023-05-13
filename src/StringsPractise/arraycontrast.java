package StringsPractise;

import java.util.Scanner;

public class arraycontrast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int m = scanner.nextInt();
            int[] c = new int[m];
            for (int i = 0; i < m; i++) {
                c[i] = scanner.nextInt();
            }
            int count = 0;
            int f = 0;
            for (int i = 0; i < m - 1; i++) {
                if (c[i] > c[i + 1]) {
                    if (f != 1)
                        count++;
                    f = 1;
                } else if (c[i] < c[i + 1]) {
                    if (f != -1)
                        count++;
                    f = -1;
                }
            }
            System.out.println(count + 1);
        }

    }

}
