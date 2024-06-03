import java.util.ArrayList;

/*
Задание №3
📌 Создать список типа ArrayList<String>.
📌 Поместить в него как строки, так и целые числа.
📌 Пройти по списку, найти и удалить целые числа.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList str = new ArrayList<String>();
        str.add("null");
        str.add(1);
        str.add("hello");
        str.add(12);
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i) instanceof Integer) {
                str.remove(str.get(i));
            }
        }
        System.out.println(str);
    }
}