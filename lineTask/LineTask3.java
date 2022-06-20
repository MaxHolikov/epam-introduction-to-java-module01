package by.holikov.javaIntroduction.basic.lineTask;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)*tg xy / (𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)

public class LineTask3 {
    public static void main(String[] args) {
        double value;
        double x;
        double y;

        x = 0;
        y=Math.PI/2;

        if (Math.cos(x) - Math.sin(y) != 0) {
            value = (Math.sin(x) + Math.cos(y))*Math.tan(x * y) / (Math.cos(x) - Math.sin(y));
            System.out.println(value);
        } else {
            System.out.println("Error, Enter new number");
        }
    }
}
