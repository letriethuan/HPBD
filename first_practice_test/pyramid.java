package first_practice_test;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long Suml = 0;
        long Sumt = 0;
        long layer = 0;
        for (long n = 0; Sumt <= m; n++) {
            Suml += (n * (n + 1)) / 2;
            Sumt += Suml;
            if (Sumt > m) {
                break;
            }
            layer = n;
        }
        System.out.println(layer + 1);
        sc.close();
    }
}