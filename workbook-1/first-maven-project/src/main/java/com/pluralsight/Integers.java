package com.pluralsight;

import java.util.Scanner;

public class Integers {


    public static void main(String[] args) {
        int firstInt, secondInt;
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your first number");
        firstInt = scanner.nextInt();

        System.out.println("please enter your second number");
        secondInt = scanner.nextInt();


        int sum = firstInt + secondInt;

        System.out.println(" the sum of " + firstInt + " and " + secondInt +" is; "+ sum );
    }


}
