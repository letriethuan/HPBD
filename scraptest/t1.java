package scraptest;
import java.util.Scanner;
public class t1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstsentence=sc.nextLine();
        String endtsentence=sc.nextLine();
        long num=-1;
        for (int i=0;i<firstsentence.length();i++) {
            String sentence=firstsentence.substring(i);
            if (endtsentence.startsWith(sentence)) {
                num=i+endtsentence.length(); 
                break;
            }
        }
        if (num==-1){
            num=firstsentence.length()+endtsentence.length();
        }
       System.out.println(num);
        sc.close();
    }
}
