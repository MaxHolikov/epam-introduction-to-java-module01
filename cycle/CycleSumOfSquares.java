package by.holikov.javaIntroduction.basic.cycle;

//Найти сумму квадратов первых ста чисел.

public class CycleSumOfSquares {
    public static void main(String[] args) {

        double sumSquaresOneHundredNumbers;

        sumSquaresOneHundredNumbers = sumOfSquares();

        System.out.println("Sum of squares the first one hundred numbers = " + sumSquaresOneHundredNumbers);

    }

    private static double sumOfSquares() {
        double sumSquares;
        sumSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumSquares = Math.pow(i, 2) + sumSquares;
        }
        return sumSquares;
    }
}
