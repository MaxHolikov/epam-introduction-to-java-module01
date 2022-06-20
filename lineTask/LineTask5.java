package by.holikov.javaIntroduction.basic.lineTask;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

public class LineTask5 {
    public static void main(String[] args) {
        int seconds;
        int hours;
        int minutes;
        int sec;
        String hoursStr;
        String minutesStr;
        String secStr;
        hoursStr = "ч";
        minutesStr = "мин";
        secStr = "с";
        //Enter a time in seconds
        seconds = 567351;

        if (seconds >= 0) {
            hours = seconds / 3600;
            dataOutput(hours, hoursStr);
            minutes = seconds % 3600 / 60;
            dataOutput(minutes, minutesStr);
            sec = seconds - hours * 3600 - minutes * 60;
            dataOutput(sec, secStr);
        } else {
            System.out.println("Your number isn`t correct, do it again");
        }
    }

    private static void dataOutput(int value, String str) {
        if (value >= 0 && value <= 9) {
            System.out.print("0" + value + str + " ");
        } else {
            System.out.print(value + str + " ");
        }
    }

}

