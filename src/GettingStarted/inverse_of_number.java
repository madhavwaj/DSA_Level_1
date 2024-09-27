package GettingStarted;
//Qustion 5. "Write a program that takes an integer as input and rearranges its digits such that
// each digit in the original number is replaced by its position in the number.
// The output should represent the new number formed by assigning the position of each digit
// in the original number to the corresponding position in the result."

import java.util.*;

public class inverse_of_number{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int num = n;
        int nod = 0;

        while(num != 0){
            num = num / 10;
            nod++;
        }

        int ans = 0;
        for(int i = 1; i <= nod; i++){
            int ld = n % 10;
            n = n / 10;

            ans = ans + i * (int)Math.pow(10, ld - 1);
        }

        System.out.println(ans);

    }
}