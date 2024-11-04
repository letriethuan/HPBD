package scraptest;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long[] price = { Long.MAX_VALUE, 500000000, 200000000, 100000000, 50000000, 10000000, 2000000 };// Thêm một giá
                                                                                                        // trị lớn trước
                                                                                                        // để tránh sai
                                                                                                        // sót khi sort
        double[] dis_rate = { 0.15, 0.12, 0.1, 0.07, 0.05, 0.03 };
        double total = 0;
        for (int i = 1; i < price.length; i++) {
            if (N > price[i]) {
                total += Math.min(price[i - 1] - price[i], N - price[i]) * (dis_rate[i - 1]);
            }
        }
        System.out.println(N - (long) total);
        sc.close();
    }
}