package GettingStarted_01;

import java.util.Scanner;

public class GCD_AND_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int a1 = a;
        int b1 = b;
        while(a%b!=0){
            int rem = a%b;
            a= rem;
            b = a;
        }
        int gcd = b;
        int lcm = (a1*b1)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
//code ends here
