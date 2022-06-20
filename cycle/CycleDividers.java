package by.holikov.javaIntroduction.basic.cycle;

import java.sql.SQLOutput;
import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//        m и n вводятся с клавиатуры.

public class CycleDividers {
    public static void main(String[] args) {
        int m;
        int n;
        String strM;
        String strN;
        strM = "m: ";
        strN = "n: ";

        m = enterFromConsol(strM);
        n = enterFromConsol(strN);
        allDividers(m,n);

    }

        private static int enterFromConsol(String strElement) {
            boolean isCorrect = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter you positive number "+ strElement);
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

    private static void allDividers(int firstNumberInterval, int secondNumberInterval) {
        String allDividers = "";

        for (int i = firstNumberInterval; i <= secondNumberInterval; i++){
            allDividers = String.valueOf(i)+": ";
            for (int j = 2; j < Math.abs(i); j++) {
                if (i % j == 0) {

                    allDividers = allDividers + String.valueOf(j) + " ";
                }
            }
            System.out.println(allDividers);
        }
    }
}