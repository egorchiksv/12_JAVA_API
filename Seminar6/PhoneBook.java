import java.util.*;

public class PhoneBook {
    private static HashMap<String, HashSet<String>> phoneBook = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            clearConsole();
            System.out.println("Телефонная книга:\n1. Просмотреть все записи\n2. Найти запись\n3. Добавить запись\n4. Удалить запись\n5. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();
            clearConsole();

            switch (choice) {
                case 1:
                    printAllBook();
                    break;
                case 2:
                    findNums();
                    break;                
                case 3:
                    addNum();
                    break;
                case 4:
                    deleteNum();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("\nНекорректный выбор! Попробуйте снова.\n");
            }
        }
        System.out.println("\nВсего хорошего\n");
    }

    private static void printAllBook() {
        if (phoneBook.isEmpty()) {
            System.out.println("\nТелефонная книга пуста.\n");
        } else {
            List<Map.Entry<String, HashSet<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
            sortedEntries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
            
            System.out.println("Все записи телефонной книги:\n");
            for (Map.Entry<String, HashSet<String>> entry : sortedEntries) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        waitEnter();
    }

    private static void findNums() {
        System.out.print("ПОИСК ЗАПИСИ\n\n");
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        if (!phoneBook.containsKey(name)){
            System.out.print("Такого абонента нет");
        } else {
            System.out.println(name + ": " + phoneBook.get(name));
        }
        waitEnter();
    }
   
    private static void addNum() {
        System.out.print("ДОБАВЛЕНИЕ ЗАПИСИ\n\n");
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String phoneNum = scanner.nextLine();
        if (!phoneBook.containsKey(name)){
            phoneBook.put(name, new HashSet<String>());
        }        
        phoneBook.get(name).add(phoneNum);
        System.out.println("\nЗапись добавлена: " + name + ": " + phoneNum);
        waitEnter();
    }
    private static void deleteNum() {
        System.out.print("УДАЛЕНИЕ ЗАПИСИ\n\n");
        System.out.print("Введите имя для удаления: ");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            Set<String> phoneNum = phoneBook.remove(name);
            System.out.println("Запись удалена: " + name + ": " + phoneNum);
        } else {
            System.out.println("Запись с таким именем не найдена.");
        }
        waitEnter();
    }

    private static void waitEnter() {
        System.out.print("\nНажмите ENTER для продолжения...");
        scanner.nextLine();
        clearConsole();
    }

    public static void clearConsole() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        
        }
    }
}