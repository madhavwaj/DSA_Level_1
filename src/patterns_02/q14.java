package patterns_02;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1; i<=10; i++){
            int v = i*x;
            System.out.println(x + " * " + i + " = " + v);
        }
    }
}
