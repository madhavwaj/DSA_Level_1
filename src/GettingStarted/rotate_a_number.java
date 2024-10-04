package GettingStarted;

import java.util.Scanner;

public class rotate_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // Calculate number of digits
        int nod = 0;
        int temp = n;
        while (temp > 0) {
            temp /= 10;
            nod++;
        }

        // Normalize k to be within the range of digits
        k = k % nod;
        if (k < 0) {
            k += nod;
        }

        // Determine the division and multiplication factors
        int div = 1;
        int mul = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div *= 10;
            } else {
                mul *= 10;
            }
        }

        // Perform the rotation
        int q = n / div;
        int r = n % div;

        int rot = r * mul + q;
        System.out.println(rot);
    }
}
