package scraptest;
import java.util.Scanner;
public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long sum=1;
        int layer=1;
        for (int i=2;i<=n;i++){
            sum+=i+(0.5*(i*(i-1)));
            if (sum<=n){
                layer++;
            }else{
                break;
            }
        }
        System.out.println(layer);
        sc.close();
    }
}
