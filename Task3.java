package Tasks;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();

        LocalTime localTime = LocalTime.now();
        LocalTime LocTime = java.time.LocalTime.parse(localTime.format(DateTimeFormatter.ofPattern("HH:mm")));
        String time1 = "05:00";
        String time11 = "11:59";
        String time2 = "12:00";
        String time22 = "17:59";
        String time3 = "18:00";
        String time33 = "22:59";
        String time4 = "23:00";
        String time44 = "04:59";
        String pattern = "HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalTime t1 = LocalTime.from(LocalTime.parse(time1, formatter));
        LocalTime t11 = LocalTime.from(LocalTime.parse(time11, formatter));
        LocalTime t2 = LocalTime.from(LocalTime.parse(time2, formatter));
        LocalTime t22 = LocalTime.from(LocalTime.parse(time22, formatter));
        LocalTime t3 = LocalTime.from(LocalTime.parse(time3, formatter));
        LocalTime t33 = LocalTime.from(LocalTime.parse(time33, formatter));
        LocalTime t4 = LocalTime.from(LocalTime.parse(time4, formatter));
        LocalTime t44 = LocalTime.from(LocalTime.parse(time44, formatter));
        System.out.println(LocTime);
        if (t1.compareTo(localTime) < 0 && t11.compareTo(LocTime) > 0) {
            System.out.println("Доброе утро, " + name);
        }
        if (t2.compareTo(localTime) < 0 && t22.compareTo(LocTime) > 0) {
            System.out.println("Добрый день, " + name);
        }
        if (t3.compareTo(localTime) < 0 && t33.compareTo(LocTime) > 0) {
            System.out.println("Добрый вечер, " + name);
        }
        if (t4.compareTo(localTime) < 0 && t44.compareTo(LocTime) > 0) {
            System.out.println("Доброй ночи, " + name);
        }
    }
}
