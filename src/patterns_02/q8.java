package patterns_02;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j == n+1){
                    System.out.print("*");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
