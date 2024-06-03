import java.util.*;

/*
Задание №1
📌 Заполнить список десятью случайными числами.
📌 Отсортировать список методом sort() и вывести его на экран.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            intList.add(random.nextInt(0, 10));
        }
        System.out.println(intList);
        Collections.sort(intList);
        System.out.println(intList);
        System.out.println(Collections.min(intList));
        System.out.println(Collections.max(intList));
    }


}