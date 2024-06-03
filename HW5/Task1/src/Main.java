/*
Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции:
add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.
find(String name): Поиск номеров телефона по имени в телефонной книге.
Если запись с именем name существует, возвращает список номеров телефона для этой записи.
Если запись с именем name не существует, возвращает пустой список.
getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.
Пример.
На входе:
add("Alice", 123456);
add("Alice", 789012);
add("Bob", 789012);
На выходе:
Команды:
find("Alice")
getPhoneBook()
find("Me")
Результат:
[123456, 789012].
{Bob=[789012], Alice=[123456, 789012]}
[]
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;
        name1 = "Ivanov";
        name2 = "Petrov";
        phone1 = 123456;
        phone2 = 654321;

        add(name1, phone1);
        add(name1, phone2);
        add(name2, phone2);

        System.out.println(find(name1));
        System.out.println(getPhoneBook());
        System.out.println(find("Me"));
    }

    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public static void add(String name, Integer phoneNum) {
//        ArrayList<Integer> arrayList_phoneNum = new ArrayList<>();
//        if (phoneBook.get(name) != null) {
//            arrayList_phoneNum = phoneBook.get(name);
//            arrayList_phoneNum.add(phoneNum);
//            phoneBook.put(name, arrayList_phoneNum);
//        } else {
//            arrayList_phoneNum.add(phoneNum);
//            phoneBook.put(name,arrayList_phoneNum);
//        }
//******************************************************************
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(phoneNum);
            phoneBook.put(name, values);
        }
    }

    public static ArrayList<Integer> find(String name) {
//        ArrayList<Integer> arrayList_find = new ArrayList<>();
//        if (phoneBook.get(name) != null) arrayList_find = phoneBook.get(name);
//        return arrayList_find;
//******************************************************************************
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return new ArrayList<Integer>();
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}