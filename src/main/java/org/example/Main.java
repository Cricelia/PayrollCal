package org.example;
import java.util.Scanner;

import static org.example.UpdatedPayrollCalculator.Information;
import static org.example.UpdatedPayrollCalculator.Pay;

public class Main {
    public static void main(String[] args) {
        UpdatedPayrollCalculator calculator = new UpdatedPayrollCalculator();

        calculator.Information();
        calculator.Pay();

    }
}