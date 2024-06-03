package lesson1;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        // String s = null;
        // System.out.println(s);
        // float f = 123.45f;
        // double d = 123.45;
        // System.out.println(f);
        // System.out.println(d);
        // char ch = 123;
        // char ch1 = '{';
        // System.out.println(ch);
        // System.out.println(ch1);
        // int a = 13;
        // double d = a;
        // System.out.println(d);
        // boolean f = true && false;
        // System.out.println(f);
        // boolean f1 = true ^ false;
        // System.out.println(f1);
        // var i = 123;
        // int i = 123_123_34;
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);
        // String s = "qwer";
        // s.charAt(1);
        // System.out.println(s.charAt(1));
        // int a = 123;
        // a++;
        // System.out.println(a);
        // System.out.println(++a);
        // boolean f = 123 != 234;
        // System.out.println(f);
        // побитовая операция
        // int a = 8;
        // // 1000
        // System.out.println(a << 1);
        // // 10000

        // int a = 18;
        // // 10010
        // System.out.println(a >> 1);
        // // 1001

        // // побитовое сравнение
        // int a = 5;
        // int b = 2;
        // System.out.println(a | b);
        // // 101
        // // 010
        // // 111
        // System.out.println(a & b);
        // // 101
        // // 010
        // // 000
        // System.out.println(a ^ b);
        // // 101
        // // 010
        // // 111
        // String s = "qwwe1"; // длина 4, индексы 0..3
        // boolean b = s.length() >= 5 && s.charAt(4) == '1';// с двумя && (||) называют
        // быстрая операция. Она проверяет первое, а второе, только если требуется
        // подтверждение. С одной & (|) всегда проверяет оба условия
        // System.out.println(b);

        // int[] arr = new int[10];
        // arr[3] = 13;
        // System.out.println(arr[3]);

        // Scanner iScanner = new Scanner(System.in);
        // System.out.println("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // String s = "qwe";
        // int a = 123;
        // String q = s + a; // при выполнении этой операции будет образовываться 4 строки. Первая s, вторая преобразование int a в строку, третья s+a и четвертая q.
        // System.out.println(q);

        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.printf("%d + %d = %d \n", a, b, c);
        // System.out.println(res);

        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi); // 3,141500
        // System.out.printf("%.2f\n", pi); // 3,14
        // System.out.printf("%.3f\n", pi); // 3,141
        // System.out.printf("%e\n", pi); // 3,141500e+00
        // System.out.printf("%.2e\n", pi); // 3,14e+00
        // System.out.printf("%.3e\n", pi); // 3,141e+00

        // int b = 111;
        // {
        //     int a = 222;
        //     System.out.println(a + b); 
        // }
        // int a = 123;
        // System.out.println(a);
            
        // lib.sayHi();

        // int a = 1;
        // int b = 2;
        // int min = a < b ? a : b;
        // System.out.println(min);

        // int a = 123;

        // switch (a) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //     case 6:
        //         System.out.println("a");
        //         break;
        //     case 10: System.out.println("b");
        //         break;
        //     default:
        //         break;
        // }

        // for (int i = 0; i < 10; i++) {
        //     if (i % 2 != 0)
        //         continue;
        //     System.out.println(i);
        // }

        // for (int i = 0; i < 10; i++) {
        //     if (i % 2 != 0)
        //         break;
        //     System.out.println(i);
        // }

        int[] arr = new int[] {1, 2, 3, 4, 5, 77};
        for (int item : arr) {
            System.out.println(item);
        }

    }
}
