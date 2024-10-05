package GettingStarted_01;

import java.util.Scanner;

public class is_a_number_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            //do baar divide hota hai toh prime hai agar 2 se jyda
           // baar divide hota hai toh prime nahi hai
                int count = 0;
            for(int div = 1; div <= n; div++){
                if(n%div == 0){
                    count++;
                }
            }

        }
    }
}
