package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner asking = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = asking.nextLine();

        System.out.println("How many hours did you work? ");
        float hours = asking.nextFloat();

        System.out.println("Enter Pay Rate: ");
        float pay = asking.nextFloat();

        float grossPay = hours * pay;

        System.out.println("Name: " + name);
        System.out.println("Gross Pay: $ " + grossPay);





    }
}