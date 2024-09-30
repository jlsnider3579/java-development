package com.pluralsight.financialcalc;

import java.sql.SQLOutput;
import java.util.Scanner;
/*Calculator 1: A mortgage calculator - it is used to calculate out how much a monthly payment for a loan would be (minus any insurance or taxes), as well as how much interest you would pay over the life of the loan.
»
It would accept the principal, interest rate, and loan length from the user
It would display the expected monthly payment and total interest paid
Example: A $53,000 loan at 7.625% interest for 15 years would have a $495.09/mo payment with a total interest of $36,115.99
This calculator would use a compounded interest formula.
*/
public class FinancialCalculator {
    public static double[] mortgageCalculator(double principle, double yearlyRate, int loanLength) {
      yearlyRate /= 100;

       double monthlyRate = yearlyRate /12;
       int numberOfPayments = loanLength * 12;
       double monthlyPayment = principle * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
               (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
       double totalInterest = (monthlyPayment * numberOfPayments) - principle;
        return new double[] {monthlyPayment,totalInterest};



    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the principle amount: ");
        double principle = scanner.nextDouble();
        System.out.print("enter the yearly interest rate: ");
        double yearlyRate = scanner.nextDouble();
        System.out.print("enter the loan length: ");
        int loanLength = scanner.nextInt();
        double[] usersMonthlyPaymentAndInterest = mortgageCalculator(principle,yearlyRate,loanLength);
        System.out.printf("your monthly payments: $%.2f%n", usersMonthlyPaymentAndInterest[0]);
        System.out.printf("your total interest: $%.2f ",usersMonthlyPaymentAndInterest[1]);
    }

    }






