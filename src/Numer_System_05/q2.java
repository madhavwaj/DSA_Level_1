package Numer_System_05;
//any base to decimal
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = getValueIndecimal(n,b);
        System.out.println(d);
    }
    public static int getValueIndecimal(int n, int b){
        int rv = 0;
        int p = 1;
        while(n>0){
            int dig = n%10;
            n=n/10;

            rv += dig*p;
            p=p*b;

        }
        return rv;
    }
}
