package by.holikov.javaIntroduction.basic.lineTask;

//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае

import java.util.Scanner;

public class LineTask6 {
    public static void main(String[] args) {
        boolean isCurrect;
        int x;
        int y;
        isCurrect = false;
        String strCoordinateX = "X:";
        String strCoordinateY = "Y:";

        x = enterFromConsol(strCoordinateX);
        y = enterFromConsol(strCoordinateY);

        if ((x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4)) {
            isCurrect = true;
            System.out.println(isCurrect);
        } else {
            System.out.println(isCurrect);
        }
    }

    private static int enterFromConsol(String coordinate) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinate " + coordinate);
        int value;
        while (!sc.hasNextInt()) {
            String str = sc.next();
            System.out.println("Your coordinate isn`t currect. Do it again");
            System.out.println("Enter coordinate " + coordinate);
        }
        value = sc.nextInt();
        return value;
    }

}

