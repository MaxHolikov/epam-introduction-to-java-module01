package by.holikov.javaIntroduction.basic.cycle;

//Составить программу нахождения произведения квадратов первых двухсот чисел

import java.math.BigInteger;

public class CycleMultiplySquares {
    public static void main(String[] args) {

        BigInteger multiplySquaresTwoHundredNumbers;

        multiplySquaresTwoHundredNumbers = multiplySquares();

        System.out.println("Multiplication of squares the first two hundred numbers = " + multiplySquaresTwoHundredNumbers);

    }

    private static BigInteger multiplySquares() {

        BigInteger multiplySquares;
        multiplySquares = BigInteger.valueOf(1);

        for (int i = 1; i <= 200; i++) {
            multiplySquares = multiplySquares.multiply(BigInteger.valueOf(i * i));
        }
        return multiplySquares;
    }
}
