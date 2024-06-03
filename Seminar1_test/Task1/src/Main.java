/*
Задание №1
📌 Написать программу, которая запросит пользователя ввести <Имя> в
консоли.
📌 Получит введенную строку и выведет в консоль сообщение “Привет,
<Имя>!”
 */
/*
Задание №2
📌 В консоли запросить имя пользователя. В зависимости от
текущего времени, вывести приветствие вида
📌 "Доброе утро, <Имя>!", если время от 05:00 до 11:59
📌 "Добрый день, <Имя>!", если время от 12:00 до 17:59;
📌 "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
📌 "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        LocalDateTime dateTime = LocalDateTime.now();
        int i = dateTime.getHour();
        String temp = "";
        if(i >= 5 && i < 12) {
            temp = "Доброе утро";
        }
        if(i >= 12 && i < 18) {
            temp = "Добрый день";
        }
        if(i >= 18 && i < 23) {
            temp = "Добрый вечер";
        }
        if(i < 5 || i == 23) {
            temp = "Доброй ночи";
        }
        System.out.println(temp + "," + s);
    }
}