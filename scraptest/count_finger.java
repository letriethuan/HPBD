package scraptest;

import java.util.Scanner;

public class count_finger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long finger = n % 18;
        String[] bantay = { "cai", "tro", "giua", "ap ut", "ut" };
        if (finger > 10) {
            finger = 20 - finger;
        }
        if (finger <= 5) {
            System.out.println("Ngon " + bantay[(int) finger - 1] + " cua ban tay trai");
        } else if (finger > 5) {
            System.out.println("Ngon " + bantay[10 - (int) finger] + " cua ban tay phai");
        }
        sc.close();
    }
}
