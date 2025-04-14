package org.example;

import java.util.Scanner;

public class UpdatedPayrollCalculator {
    static Scanner asking = new Scanner(System.in);
    static String name;
    static float hours;
    static float pay;
    static float grossPay;
    public static void Information() {

        System.out.println("What is your name? ");
         name = asking.nextLine();

        System.out.println("How many hours did you work? ");
             hours = asking.nextFloat();

        System.out.println("Enter Pay Rate: ");
             pay = asking.nextFloat();

    }

    public static void Pay() {

        grossPay = hours * pay;

        System.out.println("Name: " + name);
        System.out.println("Gross Pay: $ " + grossPay);


    }

}
