import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

/*
Задание №1
📌 Дано четное число N (>0) и символы c1 и c2.
📌 Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        String c1;
        String c2;
        int n;
        logger.info("Введите значение c1:");
        c1 = scanner.next();
        logger.info("Введите значение c2:");
        c2 = scanner.next();
        logger.info("Введите значение N:");
        n = scanner.nextInt();

        if(n <= 0){
            throw new Exception("Не валидное значение N");
        }

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.print(c1);
            }
            if(i % 2 == 1){
                System.out.print(c2);
            }
        }
    }
}