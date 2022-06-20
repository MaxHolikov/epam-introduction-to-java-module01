package by.holikov.javaIntroduction.basic.lineTask;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

public class LineTask4 {
    public static void main(String[] args) {
        double firstPart;
        double secondPart;
        double answer;
        double number;
        //Enter number like: XXX.XXX
        number = 123.579;
        firstPart=(double)(int)number/1000;
        secondPart=number*1000%1000;
        answer=(secondPart+firstPart);
        System.out.println(answer);
    }
}

