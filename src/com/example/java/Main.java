package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numeric value: ");
        String firstValueString = sc.nextLine();

        System.out.println("Enter a numeric value: ");
        String secondValueString = sc.nextLine();

        double firstValue = Double.parseDouble(firstValueString);
        double secondValue = Double.parseDouble(secondValueString);

        System.out.println("The answer is: " + (firstValue + secondValue));
    }
}
