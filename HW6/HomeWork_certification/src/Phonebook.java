import java.util.*;

public class Phonebook {
    public static Map<String, ArrayList<Integer>> phonebook = new HashMap<>();

    public static void addNamePhone(User user){
        phonebook.computeIfAbsent(user.name, k -> new ArrayList<>()).add(Integer.parseInt(String.valueOf(user.number).
                replace("[", "").replace("]", "")));
    }
    public static void addPhone(String name, Integer newphone){
        ArrayList<Integer> newphones = new ArrayList<>();
        User user = new User(name, newphones);
        int n = 0;
        for (Map.Entry<String,ArrayList<Integer>> pair : phonebook.entrySet()) {
            if (user.name.equals(pair.getKey()) && name.hashCode() == pair.getKey().hashCode()) {
                phonebook.computeIfAbsent(user.name, k -> new ArrayList<>()).add(newphone);
                n += 1;
            }
        }
        if (n == 0) System.out.println("Записи с таким именем нет");
        else System.out.println("\nЗапись добавлена: " + name + ": " + newphone);
    }

    public static void printAll(){
        if (phonebook.isEmpty()) {
            System.out.println("В телефонной книге нет записей");
        } else {
            List<Map.Entry<String, ArrayList<Integer>>> sortphonebook = new ArrayList<>(phonebook.entrySet());
            sortphonebook.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
            System.out.println("Телефонная книга");
            for (Map.Entry<String, ArrayList<Integer>> entry : sortphonebook) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public static void removePhone(String name, Integer delphone, Integer del) {
        if (del == 1) {
            phonebook.remove(name);
        } else {
            phonebook.get(name).remove(delphone);
        }
    }

}
