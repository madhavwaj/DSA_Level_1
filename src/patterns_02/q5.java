package patterns_02;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        int sp = n/2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                sp--;
                st= st+2;
            }else{
                sp++;
                st= st-2;
            }
            System.out.println();
        }

    }
}