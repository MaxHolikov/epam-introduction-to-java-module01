package by.holikov.javaIntroduction.basic.cycle;

import java.util.Scanner;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

public class CycleConformASCII {

    public static void main(String[] args) {

        for (int i = 31; i <= 255; i++) {
            System.out.print(i + " - " + (char) i + "; ");
            if (i %5 == 0 ){
                    System.out.println();}
        }

    }
}