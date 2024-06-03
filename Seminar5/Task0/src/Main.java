/*
Задание №0
📌 Создать структуру для хранения Номеров паспортов и Фамилий
сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
📌 Вывести данные по сотрудникам с фамилией Иванов.
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> passNumToName = new TreeMap<>(Comparator.reverseOrder());//Comparator.reverseOrder() Позволяет выводить в обратном порядке
        passNumToName.put(123456, "Иванов");// кладем в Map значение и ключ. Map изменяемый
        passNumToName.put(321456, "Васильев");
        passNumToName.put(234561, "Петрова");
        passNumToName.put(234432, "Иванов");
        passNumToName.put(654321, "Петрова");
        passNumToName.put(345678, "Иванов");

        Map<Integer, String> map = Map.of(123456, "Иванов", 321456, "Васильев");// кладем в Map значение и ключ, но делаем Map уже не изменяемым
        passNumToName.put(321456, "Васильев");
        System.out.println(passNumToName);

        for(Map.Entry<Integer, String> entry : passNumToName.entrySet()) {
            if (entry.getValue().equals("Иванов"))
                System.out.println(entry);
        }

        List<Map.Entry<Integer, String>> ivanovs = passNumToName.entrySet()
                .stream()
                .filter(e -> e.getValue().equals("Иванов")).toList();
        System.out.println(ivanovs);
    }
}