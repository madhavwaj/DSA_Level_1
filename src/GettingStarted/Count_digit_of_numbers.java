package GettingStarted;

import java.util.Scanner;

public class Count_digit_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int counter = 0;

        while(a>0) {
            a = a / 10;
            counter++;
        }
        System.out.println(counter);
    }
}