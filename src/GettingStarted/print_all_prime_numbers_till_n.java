package GettingStarted;

import java.util.Scanner;

public class print_all_prime_numbers_till_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int high = sc.nextInt();
        int low = sc.nextInt();
        for (int n = low; n <= high; n++) {
            int counter = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    counter++;
                    break;
                }
            }
            if (counter == 0) {
                System.out.println(n);
            }
        }
    }
    }

