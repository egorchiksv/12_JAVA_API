import java.util.ArrayList;
import java.util.List;

/*
Задание №4
📌 Каталог товаров книжного магазина сохранен в виде двумерного
списка List<ArrayList<String>> так, что на 0й позиции каждого
внутреннего списка содержится название жанра, а на остальных
позициях - названия книг. Напишите метод для заполнения данной
структуры.
 */
public class Main {
    static List<ArrayList<String>> books = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String> proza = new ArrayList<>(List.of("proza", "Война и Мир", "Буратино"));
        ArrayList<String> poezia = new ArrayList<>(List.of("poezia", "Барадино", "Евгений Онегин"));
        ArrayList<String> skazki = new ArrayList<>();
        skazki.add("skazki");
        skazki.add("Маша и Медведь");
        skazki.add("Красная шапочка");
        books.addAll(List.of(proza, poezia, skazki));
        System.out.println(books);
    }
}