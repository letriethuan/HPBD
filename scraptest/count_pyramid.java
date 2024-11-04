package scraptest;

import java.util.Scanner;

public class count_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextInt();
        long tSum = 0;
        long layer = 0;
        for (long n = 1; tSum <= m; n++) {
            long lSum = (n * (n + 1)) / 2; // Cap so cong
            tSum += lSum;
            if (tSum > m) {
                break;
            }
            layer = n;
        }

        System.out.println(layer);
        sc.close(); //
    }
}
