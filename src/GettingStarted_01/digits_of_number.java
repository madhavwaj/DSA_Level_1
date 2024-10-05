package GettingStarted_01;

import java.util.Scanner;
public class digits_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         //jab tak temp ka value 0 nahi ho jata tab tak temp ko divide krte rho or nod me store krte rho
         int nod = 0;
         int temp = n;
         while(temp != 0){
             temp = temp/10;
             nod++;
         }
         int div = (int)Math.pow(10, nod-1);
         while(div !=0) {
             int q = n / div;
             System.out.println(q);
             n = n % div;
             div = div / 10;

         }
    }
}
