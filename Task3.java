/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;
import java.util.Scanner;

/**
 *
 * @author Thang Manh Tran
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner sc
        Scanner sc = new Scanner(System.in);
        // Print question asking for 
        System.out.print("Your current salary: ");
        // Receive the input for currentSalary
        double currentSalary = sc.nextDouble();
        // Print the years you will working for
        System.out.print("How many years will you work for: ");
        // Receive the input for years
        int years = sc.nextInt();
        // Call method calcFutureSalary
        double futureSalary = calcFutureSalary(currentSalary,years);
        // Print futureSalary
        System.out.printf("You future salary is %1.2f\n", futureSalary);
    }
    public static double calcFutureSalary(double currentSalary, int year) {
        for (int i = 0; i < year ; i++) {
            if (i < 2) 
                currentSalary *= 1.03;   
            else if (i < 9) 
                currentSalary *= 1.05;
            else 
                currentSalary *= 1.08;
        }
        return currentSalary;
    }
}
