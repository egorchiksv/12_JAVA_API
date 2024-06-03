import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // метод получения числа
    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    // метод получения числа операции
    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;
    }

    // метод получения результата
    static double getResult(String opr, int num1, int num2) {
        double result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Введите оператор: -, +, *, /");
                result = -1;
                break;
        }
        return result;

    }
    public static void main(String[] args) {
        /*
        Вычислить n-ое треугольного число(сумма чисел от 1 до n).
        Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное
        число.
        Если число n < 1 (ненатуральное) метод должен вернуть -1.
        Пример
        n = 4 -> 10
        n = 5 -> 15
         */

//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("Введите первое число: ");
//        int n = iScanner.nextInt();
//        System.out.printf("Треугольное число: %d\n", triangle(n));
//        iScanner.close();
        //*************************************

        /*
        Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое
        на новой строке.
        Напишите свой код в методе printPrimeNums класса Answer.
        Пример
        2
        3
        5
        7
        11
        ...
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите положительное число: ");
//        int input = scanner.nextInt();
//        scanner.close();
//        List<Integer> primes = new ArrayList<>();
//
//        for (int i = 2; i <= input; i++) {
//            boolean b = true;
//
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    b = false;
//                    break;
//                }
//            }
//
//            if (b) {
//                primes.add(i);
//            }
//        }
//        System.out.println("Простые числа: " + primes);
        //********************************************************

        // Проход начинается с 2, т.к. это число является наименьшим простым
//        for (int i = 2; i <= 1000; i++) {
//
//            boolean isPrime = true;
//
//            // Проверка, является ли число i простым
//            // Проход по циклу до корня числа,
//            // т.к. дальше нет смысла искать, делителей нет.
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            // Если число i простое, вывод его на экран
//            if (isPrime)
//                System.out.println(i);
//        }


        /*
        Реализуйте простой калькулятор
        В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции
        (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.
        В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа
        должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
        Аргументы, передаваемые в метод/функцию:
        '3'
        '+'
        '7'
        На выходе:
        10.0
        */
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        double result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %.1f", num1, operations, num2, result);

    }

//    public static int triangle(int n) {
//        if (n < 1) {
//            return -1;
//        } else{
//            return (n * (n + 1)) / 2;
//        }
        //********************************************
//        if (n < 1) return -1;
//        int sum = 0;
//        for(int i = 1; i <= n; i++){
//            sum += i;
//        }
//        return sum;
//    }


}