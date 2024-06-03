import java.util.HashMap;

/*
Вы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу, которая принимает на вход
пять имен пользователей (или использует имена по умолчанию, если аргументы не предоставлены) и подсчитывает, сколько
раз каждое имя встречается.
Программа должна использовать HashMap для хранения имен и их количества вхождений.
По завершении, программа выводит результат в виде пар "имя - количество".
На входе:
'Elena'
'Elena'
'Elena'
'Ivan'
'Ivan'
На выходе:
{Ivan=2, Elena=3}
 */
public class Main {
    private static HashMap<String, Integer> names = new HashMap<>();

    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;
        name1 = "Elena";
        name2 = "Elena";
        name3 = "Elena";
        name4 = "Elena";
        name5 = "Ivan";

        addName(name1);
        addName(name2);
        addName(name3);
        addName(name4);
        addName(name5);

        showNamesOccurrences();
    }

    public static void addName(String name) {
//        int count = 1;
//        if (names.get(name) != null) {
//            count = names.get(name);
//            count += 1;
//        }
//        names.put(name, count);
//********************************************************************
        if (names.containsKey(name)) {
            names.put(name, names.get(name) + 1);
        } else {
            names.put(name, 1);
        }
    }

    public static void showNamesOccurrences() {
        System.out.println(names);
    }
}