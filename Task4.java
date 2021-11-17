/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;
import java.util.Scanner;

/**
 *
 * @author Thang Manh Tran
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Scanner sc
        Scanner sc = new Scanner(System.in);
        // Print Question asking for grade
        System.out.print("What is your grade: ");
        // Declare double grade as an double input
        double grade = sc.nextDouble();
        // declare letterGrade as method toLetterScore
        char letterGrade = toLetterScore(grade);
        // Print a message asking if the user is using switch or if.else
        System.out.print("Are you using if.else? True or false. If false then you are using switch: ");
        // Receive input for answer
        boolean printSelection = sc.nextBoolean();
        if (printSelection) {
            printMessage1(letterGrade);
        } else {
            printMessage2(letterGrade);
        }
    }
    /**
     * Create method to convert number to letter
     * @param digitScore
     * @return 
     */
    public static char toLetterScore(double digitScore)  {
        char letterGrade = ' ';
        if (digitScore <= 100 && digitScore >= 90) {
            letterGrade = 'A';
        } else if (digitScore < 90 && digitScore >= 80) {
            letterGrade = 'B';
        } else if (digitScore < 80 && digitScore >= 70) {
            letterGrade = 'C';
        } else if (digitScore < 70 && digitScore >= 60) {
            letterGrade = 'D';
        } else if (digitScore < 60) {
            letterGrade = 'F';
        }
        return letterGrade;
    }
    public static void printMessage1(char letterScore) {
        //Print message for if and else
        System.out.println("Using if and else.");
        if (letterScore == 'A') {
            System.out.println("Excelent.");
        } else if (letterScore == 'B' || letterScore == 'C') {
            System.out.println("Well Done.");
        }  else if (letterScore == 'D') {
            System.out.println("Passed.");
        }  else if (letterScore == 'F') {
            System.out.println("Better try again.");
        }
    }
    public static void printMessage2(char letterScore) {
        //Print message for switch cases
        System.out.println("Using switch.");
        switch (letterScore) {
            case 'A': 
                System.out.println("Excelent.");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Better try again.");
                break;
        }
    }
}
