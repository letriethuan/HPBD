package first_practice_test;

import java.util.Scanner;

public class max_diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] num = new long[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextLong();
        }
        // 2 4 15 3
        long max_diff = 0;
        long current_diff = 0;
        long min_Val = num[0];
        for (int i = 1; i < n; i++) {
            current_diff = num[i] - min_Val;
            if (current_diff > max_diff) {
                max_diff = current_diff;
            }
            min_Val = Math.min(min_Val, num[i]);
        }
        System.out.println(max_diff);
        sc.close();
    }
}
