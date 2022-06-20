package by.holikov.javaIntroduction.basic.brancing;

// Вычислить значение функции:
// при x<=3: x^2-3x+9;
// при x>3: 1/(x^3+6)

import java.util.Scanner;

public class BranchingFunction {
    public static void main(String[] args) {
        int x;
        double answer;
        String strX = "x:";
        x = enterFromConsol(strX);
        answer = functionX(x);
        System.out.println("F(" + x + ")= " + answer);
    }

    private static int enterFromConsol(String number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number " + number);
        int value;
        while (!sc.hasNextInt()) {
            String str = sc.next();
            System.out.println("Your number isn`t correct. Do it again");
            System.out.println("Enter a number " + number);
        }
        value = sc.nextInt();

        return value;
    }

    private static double functionX(int number) {
        double result;
        if (number <= 3) {
            result = Math.pow(number, 2) - 3 * number + 9;
        } else {
            result = 1 / (Math.pow(number, 3) + 6);
        }
        return result;
    }

}
