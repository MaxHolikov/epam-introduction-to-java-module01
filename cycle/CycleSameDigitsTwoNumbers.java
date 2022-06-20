package by.holikov.javaIntroduction.basic.cycle;

import java.util.Scanner;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class CycleSameDigitsTwoNumbers {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        firstNumber = enterFromConsol();
        secondNumber = enterFromConsol();
        System.out.println(firstNumber + " " + secondNumber);

        System.out.println(sameDigitsTwoNumbers(firstNumber, secondNumber));

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

    private static String sameDigitsTwoNumbers(int firstNumber, int secondNumber) {
        String sameDigits = "";
        int lastFirst;
        int lastSecond;
        int cloneSecond = secondNumber;

        while (firstNumber != 0) {
            lastFirst = firstNumber % 10;
            cloneSecond = secondNumber;
            while (cloneSecond != 0) {
                lastSecond = cloneSecond % 10;
                if (lastFirst == lastSecond) {
                    sameDigits = sameDigits + String.valueOf(lastFirst) + " ";
                }
                cloneSecond = cloneSecond / 10;
            }
            firstNumber = firstNumber / 10;
        }
        if (sameDigits.length() == 0) {
            sameDigits = "No identical numbers";
        }

        return sameDigits;
    }

}
