package first_practice_test;

import java.util.Scanner;
import java.util.ArrayList;

public class birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList<>();
        int testc = sc.nextInt();
        long results = 0;
        for (int i = 0; i < testc; i++) {
            long B = sc.nextInt();
            long R = sc.nextInt();
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long Z = sc.nextLong();

            long Blue_price = Math.min(X, Y + Z);
            long Red_price = Math.min(Y, X + Z);

            results = B * Blue_price + R * Red_price;

            list.add(results);
        }
        for (long e : list) {
            System.out.println(e);
        }

        sc.close();
    }
}
