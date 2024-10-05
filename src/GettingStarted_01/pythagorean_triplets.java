package GettingStarted_01;

import java.util.Scanner;

public class pythagorean_triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Find the maximum number
        int max = a;
        if (b >= a) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }

        // Check if the numbers form a Pythagorean triplet
        boolean flag = false;
        if (max == a) {
            flag = ((b * b + c * c) == (a * a));
        } else if (max == b) {
            flag = ((a * a + c * c) == (b * b));
        } else if (max == c) {
            flag = ((a * a + b * b) == (c * c));
        }

        // Output the result (true if it's a triplet, false otherwise)
        System.out.println(flag);
    }
}
