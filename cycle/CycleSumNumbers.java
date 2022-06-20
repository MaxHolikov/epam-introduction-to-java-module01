package by.holikov.javaIntroduction.basic.cycle;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

public class CycleSumNumbers {

    public static void main(String[] args) {
        int positiveNumber;
        int sumAllPosNum;

        positiveNumber = enterFromConsol();
        sumAllPosNum = sumAllPositiveNumbers(positiveNumber);
        System.out.println("Sum all positive numbers: " + sumAllPosNum);
    }

    private static int enterFromConsol() {
        boolean isCorrect = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you positive number: ");
        int positiveNumber;
        positiveNumber = 0;
        while (!isCorrect) {
            while (!sc.hasNextInt()) {
                String str = sc.next();
                System.out.println("Your number isn`t correct. Do it again");
                System.out.println("Enter positive number: ");
                isCorrect = false;
            }
            if (sc.hasNextInt()) {
                positiveNumber = sc.nextInt();

                if (positiveNumber < 1) {
                    isCorrect = false;
                    System.out.println("Your number isn`t correct. Do it again");
                    System.out.println("Enter positive number: ");
                }

                if (positiveNumber >= 1) {
                    isCorrect = true;
                    System.out.println(positiveNumber);
                    break;
                }
            }
        }
        return positiveNumber;

    }

    private static int sumAllPositiveNumbers(int positive_Number) {
        int sumNumbers;
        sumNumbers = 0;
        for (int i = 0; i <= positive_Number; i++) {
            sumNumbers = sumNumbers + i;
        }
        return sumNumbers;
    }
}