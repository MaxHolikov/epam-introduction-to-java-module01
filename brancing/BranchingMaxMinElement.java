package by.holikov.javaIntroduction.basic.brancing;

import java.util.Scanner;

//Найти max{min(a, b), min(c, d)}

public class BranchingMaxMinElement {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int max_answer;
        String strA = "a:";
        String strB = "b:";
        String strC = "c:";
        String strD = "d:";

        a = enterFromConsol(strA);
        b = enterFromConsol(strB);
        c = enterFromConsol(strC);
        d = enterFromConsol(strD);

        max_answer = findMax(findMin(a, b), findMin(c, d)); //Find max{min(a, b), min(c, d)}
        System.out.println("max_answer = " + max_answer);
    }

    private static int enterFromConsol(String element) {
        int value = 0;
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your element " + element);

        while (!sc.hasNextInt()) {
            str = sc.next();
            System.out.println("Your element isn`t correct. Do it again");
            System.out.println("Enter element " + element);
        }
        value = sc.nextInt();

        return value;
    }

    private static int findMin(int firstElement, int secondElement) {
        int min;
        if (firstElement >= secondElement) {
            min = secondElement;
        } else {
            min = firstElement;
        }
        return min;
    }

    private static int findMax(int firstElement, int secondElement) {
        int max;
        if (firstElement >= secondElement) {
            max = firstElement;
        } else {
            max = secondElement;
        }
        return max;
    }
}
