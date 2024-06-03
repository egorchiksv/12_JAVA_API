import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

/*
Задание №2
📌 Напишите метод, который сжимает строку.
📌 Пример: вход aaaabbbcdd.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        logger.info("Введите исходную строку");
        String s = scanner.next();
        if(s.length() == 0){
            throw new Exception("Введена пустая строка");
        }
        char c;
        StringBuilder sb = new StringBuilder();
        c = s.charAt(0);
        sb.append(c);
        for(char item : s.toCharArray()){
            if(c != item){
                sb.append(item);
            }
            c = item;
        }
        logger.info(sb.toString());
    }
}