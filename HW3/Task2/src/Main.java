import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива. Необходимо
удалить из списка четные числа и вернуть результирующий. Напишите свой код в методе removeEvenNumbers класса Answer.
Метод removeEvenNumbers принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список
ArrayList<Integer>
Примеры.
Исходный массив:
1, 2, 3, 4, 5, 6, 7, 8, 9
Результат:
[1, 3, 5, 7, 9]
Исходный массив:
2, 4, 6, 8
Результат:
[]
 */
public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                list.add(arr[i]);
//            }
//        }
//        System.out.println(list);
//    }

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
                i--;
            }
        }
        System.out.println(nums);
    }
}