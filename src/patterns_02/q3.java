package patterns_02;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space;j++){
                System.out.print("\t");
            }
            for(int j =1; j<=star; j++){
                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println();
        }
    }
}
