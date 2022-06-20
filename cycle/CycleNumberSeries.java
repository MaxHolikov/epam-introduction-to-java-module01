package by.holikov.javaIntroduction.basic.cycle;

import java.util.Scanner;

//продумать как адаптировать ввод данных

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
// заданному е. Общий член ряда имеет вид: an = 1/2^n +1/ 3^n.

public class CycleNumberSeries   {

    public static void main(String[] args)  {
        double e;
        double amount = 0;

        e = enterFromConsol();
        sumNumberSeries(e);


    }

    private static double functionN(double n) {
        double resultFunctionN = 0;
        resultFunctionN = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
        return resultFunctionN;
    }

    private static double enterFromConsol() {
        double consolNumber = 0;
        int n = 0;
        double funct;
        boolean isCorrect = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number type 0,0XX: ");

        while (!isCorrect) {
            while (!sc.hasNextDouble()) {
                String str = sc.next();
                System.out.println("Your number isn`t correct. Do it again");
                System.out.println("Enter new number: ");
                isCorrect = false;
            }

            if (sc.hasNextDouble()) {
                consolNumber = sc.nextDouble();

                if (consolNumber < 0) {
                    isCorrect = false;
                    System.out.println("Your number isn`t correct. Do it again");
                    System.out.println("Enter positive number: ");
                }
                funct = functionN(n);

                if (consolNumber > 0 && funct < consolNumber) {
                    while (funct < consolNumber) {
                        double buffer = funct;
                        n++;
                        funct = functionN(n);

                        if (buffer > funct) {
                            System.out.println("Your number is greater than all elements.");
                            System.out.println("Enter new number: ");
                            isCorrect = false;
                            break;
                        }
                        isCorrect = true;
                    }
                } else if (consolNumber > 0 && funct >= consolNumber) {
                    isCorrect = true;
                }
            }
        }
        return consolNumber;
    }

    private static double sumNumberSeries(double consolNumber) {
        double sumThreeNumbers;
        int counter;
        int n;
        sumThreeNumbers = 0;
        counter = 0;
        n = 0;
        double funct = functionN(n);

        if (funct < consolNumber) {
            while (funct < consolNumber) {
                n++;
                funct = functionN(n);
            }
        }
        while (funct >= consolNumber) {
            if (counter < 3) {
                sumThreeNumbers = sumThreeNumbers + funct;
                counter++;
            } else {
                break;
            }
            n++;
            funct = functionN(n);
        }
        if (counter == 1) {
            System.out.print("Only one element >= " + consolNumber + ": " + consolNumber);
        }
        if (counter == 2) {
            System.out.print("Only two elements >= " + consolNumber + ". Sum two elements = " + sumThreeNumbers);
        }
        if (counter == 3) {
            System.out.print("Sum three elements = " + sumThreeNumbers);
        }

        return sumThreeNumbers;
    }

}
