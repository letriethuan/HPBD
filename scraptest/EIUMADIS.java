package scraptest;

import java.util.Scanner;

public class EIUMADIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] value = new long[n];
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextLong();
        }
        long maxDif = 0;
        long minVal = value[0];
        long curDif = 0;
        //
        for (int i = 1; i < n; i++) {
            curDif = value[i] - minVal;
            if (curDif > maxDif) {
                maxDif = curDif;
            }
            minVal = Math.min(value[i], minVal);
        }
        System.out.println(maxDif);
        sc.close();
    }
}
