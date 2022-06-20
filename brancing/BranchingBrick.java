package by.holikov.javaIntroduction.basic.brancing;

import java.util.Scanner;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.

public class BranchingBrick {
    public static void main(String[] args) {

        boolean isCorrect;
        isCorrect = true;
        int a;
        String strA = "A:";
        int b;
        String strB = "B:";
        int x;
        String strX = "X:";
        int y;
        String strY = "Y:";
        int z;
        String strZ = "Z:";

        a = enterFromConsol(strX);
        b = enterFromConsol(strB);
        x = enterFromConsol(strX);
        y = enterFromConsol(strY);
        z = enterFromConsol(strZ);

        System.out.println("A*B: " + a + "*" + b);
        System.out.println("X*Y*Z: " + x + "*" + y + "*" + z);

        if ((x <= a && y <= b) || (x <= a && z <= b) ||
                (y <= a && x <= b) || (y <= a && z <= b) ||
                (z <= a && x <= b) || (z <= a && y <= b)) {

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
