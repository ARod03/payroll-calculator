package com.pluralsight;

import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Get the name of the person
        System.out.println("Please enter the name of employee: ");
        String name = scanner.nextLine();

        //Get the hours worked
        System.out.println("Enter the hours worked per week of employee: ");
        double hours = scanner.nextDouble();

        //Get the pay rate of the employee
        System.out.println("Enter the pay rate of employee: ");
        double payRate = scanner.nextDouble();

        //Calculate the pay role of employee
        double grossPay = payRate * hours;

        //Display the full payroll with employee

        System.out.println("The employee, " + name + ", earns $" + payRate + " per hour and works "
                + hours + " per week, making gross pay $" + grossPay + " week.");




    }
}
