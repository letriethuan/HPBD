package scraptest;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class qua_sinh_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of test cases
        List<Long> results = new ArrayList<>(); // To store results for each test case

        for (int i = 0; i < n; i++) {
            long B = sc.nextLong();
            long R = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            ////////////////////////////////////////////////////////////////////////
            long blueCost = Math.min(x, y + z); // Either buy Blue or convert Red to Blue
            long redCost = Math.min(y, x + z); // Either buy Red or convert Blue to Red

            long total = B * blueCost + R * redCost;
            results.add(total); // Store result for this test case
        }

        sc.close();
        for (long result : results) {
            System.out.println(result);
        }
    }
}
