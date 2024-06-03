/*
Задание №5
📌 Реализовать функцию возведения числа а в степень b. a, b из Z.
📌 Пример 1: а = 3, b = 2, ответ: 9
📌 Пример 2: а = 2, b = -2, ответ: 0.25
📌 Пример 3: а = 3, b = 0, ответ: 1
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

//        int result = 1;
//        for(int i = 1; i <= b; i++){
//            result *= a;
//        }
//        System.out.print(result);
//        int c = pow(a, b);
//        System.out.print(c);

        double c = Math.pow(a, b);
        System.out.println(c);
    }

//    public static int pow(int a, int b) {
//        if (b == 1) {
//            return a;
//        } else {
//            return a * pow(a, b - 1);
//        }


}