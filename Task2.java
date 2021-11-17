/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Thang Manh Tran
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner sc
        Scanner sc = new Scanner(System.in);
        // Print question asking for number of score.
        System.out.print("Please enter the number of scores to be generated: ");
        // Receive the input for the number of scores
        int num = sc.nextInt();
        double score = calcAverageScore(num);
        System.out.println("The average score is " + score);
        
    }
    public static double calcAverageScore(int num) {
        // Create random rn
        Random rn = new Random();
        // Declare discard, sum and average as variable to be stored
        int discard = 0;
        int sum = 0;
        double average = 0;
        /**
         * Create a for loop 
         * initialize i 
         * loop continues when i is less than number
         */
        for (int i=0; i < num; i++) {
            // Set temp to a random number between 0 and 100
            int temp = rn.nextInt(101);
            if (temp < 40) {
                discard++;
                //Print the number
                System.out.println("Score number " + i + " is " + temp + 
                ". " + temp + " is less than 40 and will be discarded");
            } else {
                sum += temp;
                //Print the number
                System.out.println("Score number " + i + " is " + temp);
            }
        }
        // If all numbers are discarded, return the default average value.
        if (discard == num) {
            return average;
        } else {
            average = sum/(num-discard);
            return average;
        }
    }
}
