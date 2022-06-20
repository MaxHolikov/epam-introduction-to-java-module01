package by.holikov.javaIntroduction.basic.lineTask;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// b+(b^2+4ac)^1/2 / 2a) - a^3 * c +b^(-2);

public class LineTask2 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double di;
        double z;

        a = 1.1;
        b = 2.3;
        c = 1.44;

        di = Math.pow(b, 2) + 4 * a * c;

        if (di >= 0) {
            z = b + (Math.sqrt(di)) / (2 * a) - Math.pow(a, 3) * c + 1 / Math.pow(b, 2);
            System.out.println(z);
        } else {
            System.out.println("Incorrect answer, please enter new numbers");
        }
    }
}
