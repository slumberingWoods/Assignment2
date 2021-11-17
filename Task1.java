/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.util.Scanner;

/**
 *
 * @author Thang Manh Tran
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        // Create scanner sc
        Scanner sc = new Scanner(System.in);
        // Print request for input for int month
        System.out.print("What is your month in number (January is 1): ");
        // Get the input for in month
        int month = sc.nextInt();
        // Print request for input for int years
        System.out.print("What is your year: ");
        int year = sc.nextInt();
        // Print a message asking if the user is using switch or if.else
        System.out.print("Are you using if.else? True or false. If false then you are using switch: ");
        // Receive boolean input
        boolean printSelection = sc.nextBoolean();
        // Declare days1
        int days1;
        // Create an if and else statement checking for printSelection
        if (printSelection) {
        // Call method calcDays1 for int days1
        days1 = calcDays1(month,year);
        // Print days1 using if.else
        System.out.println("(if.else) The days of this month on " + year + " is " + days1);
        } else {
        // Call method calcDays2 for int days2
        days1 = calcDays2(month,year);
        // Print days1 using switch case
        System.out.println("(Switch) The days of this month on " + year + " is " + days1);
        }
    }
    /**
     * Create method calcDays1 for int month and years
     * @param month
     * @param year
     * @return days
     */
    public static int calcDays1(int month, int year) {
        // Declare days as an int
        int days = 0;
        // Creat an if statement for 31 days month using or
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            days = 31;
        // Create an if statement checking for method isLeapYear
        else if (month == 2) {
            if (isLeapYear(year) == true) {
                days = 29;
            } else { 
                days = 28;
            }
        // Creat an if statement for 30 days month using or
        } else if (month == 4 || month == 6 || month == 9 || month == 11 )
            days = 30;
        return days;
    }
     /**
     * Create method calcDays1 for int month and years
     * @param month
     * @param year
     * @return days
     */
    public static int calcDays2(int month, int year) {
        int days = 0;
        switch (month) {
        // Case rule for when month is 1, 3, 5, 7, 8, 10, 12
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
        // Case rule for when month is 2
            case 2:
            // if method isLeapyear is true then days = 29 else days = 28
                if (isLeapYear(year) == true) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        // Case rule for when month is 4, 6, 9, 11
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }
        return days;
    }
    public static boolean isLeapYear(int year) {
        // If year is not divisible by 4 or divisible by 400 then is false
        if (year % 4 != 0 || year % 400 == 0) 
            return false;
        // If year is divisible by 100 then is true
        else if (year % 100 == 0) 
            return true;
        // otherwise is true
        else
            return true;
    }
    
}