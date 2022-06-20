package by.holikov.javaIntroduction.basic.brancing;

import java.util.Scanner;

//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

public class BranchingTriangle {
    public static void main(String[] args) {
        int x;
        int y;
        String strAngleX;
        String strAngleY;
        strAngleX = "X:";
        strAngleY = "Y:";

        x = enterFromConsol(strAngleX);
        y = enterFromConsol(strAngleY);

        if (180 - (x + y) > 0 && x > 0 && y > 0) {
            if (180 - (x + y) == 90) {
                System.out.println("Right triangle");
            } else {
                System.out.println("Not a right triangle");
            }
        } else {
            System.out.println("The triangle doesn't exist");
        }
    }

    private static int enterFromConsol(String coordinate) {
        int value = 0;
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle " + coordinate);

        while (!sc.hasNextInt()) {
            str = sc.next();
            System.out.println("Your angele isn`t correct. Do it again");
            System.out.println("Enter angele " + coordinate);
        }
        value = sc.nextInt();
        return value;
    }
}