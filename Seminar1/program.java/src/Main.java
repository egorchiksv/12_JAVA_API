import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


/*
Задание №1
📌 Написать программу, которая запросит пользователя ввести
<Имя> в консоли.
📌 Получит введенную строку и выведет в консоль сообщение
“Привет, <Имя>!”
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//         *******************************************
//        System.out.println(LocalDateTime.now());

//         *******************************************
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println("Привт, " + name + "!");
//        scanner.close();

//         *******************************************
//        while(true){
//            live();
//        }
//        char ch = ']';
//        System.out.println(ch);
//        ch = 134; // Po4emu zdes pe4ataetsa "{ " a ne kvadratnaya skobka "]"
//        System.out.println(ch);
    //}

//    public static void live() {
//        System.out.println("Сколько вам лет?");
//        Scanner scanner = new Scanner(System.in);
//        int age;
//        try {
//            age = scanner.nextInt();
//            if (age < 10) {
//                System.out.println("Вот вам конфетка :) ");
//            } else if (age < 18) {
//                System.out.println("Вот вам книга!");
//            } else if (age < 70) {
//                System.out.println("Вот вам очки!");
//            } else {
//                System.out.println("Вы прожили долгую жизнь...");
//            }
//        }
//        catch(InputMismatchException e) {
//            System.out.println("Вы ввели не число, программа закрывается!");
//            System.exit(0);
//        }
        /*
        Массивы
         */
//        int[] arr = {1, 4, 5, 4, 7, 8};
//        int[] arr1 = new int[]{1, 4, 5, 4, 7, 8};
//        int[] arr2 = new int[5];
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        arr1[2] = 10;
//        System.out.println(Arrays.toString(arr1));
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);

        /*
        Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
        */
        String str = "Добро пожаловать на курс по Java";
        String[]arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            String temp = arr[i];
            sb.append(temp).append(" ");
        }
        System.out.println(sb);
    }

}