package by.holikov.javaIntroduction.basic.cycle;

import java.util.Scanner;

// Вычислить значения функции на отрезке [а,b] c шагом h:
// y=x, при x>2;
// y= -x, при x<= -2.

public class CycleFunOnInterval {
    public static void main(String[] args) {
        int a;
        int b;
        int h;

        String strCoordinateA = "a:";
        String strCoordinateB = "b:";
        String strStepH = "h:";

        a = enterFromConsol(strCoordinateA);
        b = enterFromConsol(strCoordinateB);
        h = enterFromConsol(strStepH);

        System.out.println("[" + a + ";" + b + "]" + ", step: " + h);

        functionOnInterval(a, b, h);

    }

    private static int enterFromConsol(String coordinate) {
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number " + coordinate);

        while (!sc.hasNextDouble()) {
            String str = sc.next();
            System.out.println("Your number isn`t correct. Do it again");
            System.out.println("Enter new number " + coordinate);
        }
        value = sc.nextInt();
        return value;
    }

    private static void functionOnInterval(int firstNum, int lastNum, int step) {
        int answer;
        answer = 0;

        if (firstNum > lastNum) {
            int buffer;
            buffer = lastNum;
            lastNum = firstNum;
            firstNum = buffer;
        }

        while (firstNum <= lastNum) {
            if (firstNum > 2) {
                answer = firstNum;
                System.out.print(answer + "; ");
            }
            if (firstNum <= 2) {
                answer = -firstNum;
                System.out.print(answer + "; ");
            }
            firstNum = firstNum + step;
        }
    }
}
