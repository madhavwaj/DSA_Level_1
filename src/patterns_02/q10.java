package patterns_02;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int os = n/2; //1st row me star nahi hai
        int is = -1;
        for(int i=1; i<=n; i++){
            //loop which give outer space
              for(int j=1; j<=os; j++){
                  System.out.print("\t");
              }
              // gives star
              System.out.print("*\t");

              //loop which gives inner star
               for(int j=1; j<=is; j++){
                   System.out.print("\t");
            }
               if(i>1 && i<n){
                   System.out.print("*\t");
               }
            if (i<=n/2){
                os--;
                is = is+2;
            }else{
                os++;
                is = is-2;
            }
            System.out.println();
            }
    }
}
