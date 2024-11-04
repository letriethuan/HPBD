package scraptest;

import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long inputnum = sc.nextLong();
        long times = inputnum / 100;
        long remain = inputnum % 100;
        long total = 0;
        if (inputnum < 100) {
            total = inputnum * 200;
        }
        for (int i = 0; i < times; i++) {
            if (i <= 20) {
                total += (200 - i) * 100;
                if (i == times - 1) {
                    total += remain * (200 - times);
                }
            } else if (i > 20) {
                total += 180 * 100;
                if (i == times - 1) {
                    total += remain * (180);
                }
            }

        }
        System.out.println(total);
        sc.close();
    }
}
