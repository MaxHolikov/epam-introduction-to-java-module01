package by.holikov.javaIntroduction.basic.brancing;

import java.util.Scanner;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class BranchingLinePoints {

    public static void main(String[] args) {

        boolean isCorrect;
        isCorrect = true;
        int x1;
        String strX1 = "x1:";
        int y1;
        String strY1 = "y1:";
        int x2;
        String strX2 = "x2:";
        int y2;
        String strY2 = "y2:";
        int x3;
        String strX3 = "x3:";
        int y3;
        String strY3 = "y3:";

        x1 = enterFromConsol(strX1);
        y1 = enterFromConsol(strY1);
        x2 = enterFromConsol(strX2);
        y2 = enterFromConsol(strY2);
        x3 = enterFromConsol(strX3);
        y3 = enterFromConsol(strY3);

        System.out.println("(x1,y1): " + x1 + " " + y1);
        System.out.println("(x2,y2): " + x2 + " " + y2);
        System.out.println("(x3,y3): " + x3 + " " + y3);

        if ((y3 - y1) * (x2 - x1) == (x3 - x1) * (y2 - y1)) {
            System.out.println(isCorrect);
        } else {
            System.out.println(!isCorrect);
        }
    }

    private static int enterFromConsol(String coordinate) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinate " + coordinate);
        int value;
        while (!sc.hasNextInt()) {
            String str = sc.next();
            System.out.println("Your coordinate isn`t correct. Do it again");
            System.out.println("Enter coordinate " + coordinate);
        }
        value = sc.nextInt();
        return value;
    }
}