package com.pluralsight.financialcalc;

import java.util.Scanner;

public class FutureValueCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the initial investment amount: ");
            double principal =scanner.nextDouble();

            System.out.print("Enter the annual interest rate (in %): ");
            double annualInterestRate = scanner.nextDouble();

            System.out.print("Enter the number of years: ");
            int years = scanner.nextInt();

            double rate = annualInterestRate / 100;

            double futureValue = principal * Math.pow(1 + rate, years);

            System.out.printf("The future value of the investment is: $%.2f\n", futureValue);

            scanner.close();

        }
}
