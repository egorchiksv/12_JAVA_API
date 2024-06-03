import java.util.*;

/*
Реализуйте метод, который принимает на вход целочисленный массив arr:
- Создаёт список ArrayList, заполненный числами из исходого массива arr.
- Сортирует список по возрастанию и выводит на экран.
- Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в
списке и выводит на экран - Maximum is {число}
- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
Integer[] arr - массив целых чисел.
Пример.
Исходный массив:
4, 2, 7, 5, 1, 3, 8, 6, 9
Результаты:
[1, 2, 3, 4, 5, 6, 7, 8, 9]
Minimum is 1
Maximum is 9
 */
public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
//        List<Integer> list = Arrays.asList(arr);
//        Arrays.sort(arr);
//        double sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Minimum is " + Collections.min(list));
//        System.out.println("Maximum is " + Collections.max(list));
//        System.out.println("Average is " + sum/arr.length);
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(nums); // сортировка списка по возрастанию
        System.out.println(nums); // вывод списка на экран
        System.out.println("Minimum is " + nums.get(0)); // нахождение минимального значения в списке и вывод на экран
        System.out.println("Maximum is " + nums.get(nums.size()-1)); // нахождение максимального значения в списке и вывод на экран

        int sum = 0;
        for(int i : nums){ // вычисление суммы всех элементов списка
            sum += i;
        }
        System.out.println("Average is = " + (double) sum / nums.size());
    }
}