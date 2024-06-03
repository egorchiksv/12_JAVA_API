import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
Задание №0
📌 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
📌 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим.
 */
public class Main {
    public static void main(String[] args) {
        getTime();
    }

    public static void getTime() {
        int length = 10_000_000;

        List<Integer> intArrayList = new ArrayList<>(length);
        List<Integer> intLinkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < length; i++) {
            intArrayList.add(i);
        }

        long endTime = System.currentTimeMillis();

        double result = (endTime - startTime);

        System.out.printf("Run time for ArrayList: %s %s %n", result, "ms");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            intLinkedList.add(i);
        }
        long endTime2 = System.currentTimeMillis();

        double result2 = (endTime2 - startTime2);
        System.out.printf("Run time for LinkedList: %s %s %n", result2, "ms");


        int count = 0;

        long startTime3 = System.currentTimeMillis();
        Random random = new Random();

        while (count != 1000) {
            intLinkedList.add(40000, random.nextInt(length));
            count += 2;
        }

        long endTime3 = System.currentTimeMillis();

        System.out.println(endTime3 - startTime3);
    }

}