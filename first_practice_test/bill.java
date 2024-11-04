package first_practice_test;

import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long product = sc.nextLong();
        long times = product / 100;
        long remains = product % 100;
        long total = 0;
        if (product < 100) {
            total = product * 200;
        }
        for (int i = 0; i < times; i++) {
            if (i <= 20) {
                total += (200 - i) * 100;
                if (i == times - 1) {
                    total += (200 - times) * remains;
                }
            } else if (i > 20) {
                total += 180 * 100;
                if (i == times - 1) {
                    total += 180 * remains;
                }
            }
        }
        System.out.println(total);
        sc.close();
    }
}
