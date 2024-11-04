package scraptest;

import java.util.Scanner;

public class letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_sen = sc.nextLine();
        String end_sen = sc.nextLine();
        int count = -1;
        for (int i = 0; i < first_sen.length(); i++) {
            String sentence = first_sen.substring(i);
            if (end_sen.startsWith(sentence)) {
                count = i + end_sen.length();
            }
        }
        if (count == -1) {
            count = first_sen.length() + end_sen.length();
        }
        System.out.println(count);
        sc.close();
    }
}
