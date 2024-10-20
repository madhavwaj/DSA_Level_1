
//Q4."Write a program that takes a student's marks as input and categorizes their performance based on the following criteria:
//Marks greater than 90: "excellent"
//Marks between 81 and 90: "good"
//Marks between 71 and 80: "fair"
//Marks between 61 and 70: "meets expectations"
//Marks 60 or below: "below par"

package GettingStarted_01;
import java.util.Scanner;
public class Grading_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        if (marks > 90) {
            System.out.println("Excellent");
            }
            if (marks >= 81 && marks <= 90) {
                System.out.println("Good");
            }
            if(marks>=71 && marks<=80){
                System.out.println("Fair");
            }
            if(marks>=61 && marks<=70){
                System.out.println("Meets Expectations");
            }
            if(marks<=60){
                System.out.println("Below Par");
            }
    }
}
//end of code 
