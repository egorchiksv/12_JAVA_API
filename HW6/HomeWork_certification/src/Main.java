import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> phoneNumbers = new ArrayList<>();
        boolean running = true;
        String name;
        int del;
        int phoneNumber;

        while (running) {
            System.out.println("\n--------------------------------");
            System.out.println("Телефонная книга:\n");
            System.out.println("1. Просмотреть записи");
            System.out.println("2. Добавить новую запись");
            System.out.println("3. Добвить номер телефона в существующую запись");
            System.out.println("4. Удалить запись");
            System.out.println("5. Выйти");
            System.out.print("\nВыберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Phonebook.printAll();
                    break;
                case 2:
                    phoneNumbers.clear();
                    System.out.print("ДОБАВЛЕНИЕ ЗАПИСИ\n\n");
                    System.out.print("Введите имя: ");
                    name = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    phoneNumber = Integer.parseInt(scanner.nextLine());
                    phoneNumbers.add(phoneNumber);
                    User user = new User(name, phoneNumbers);
                    Phonebook.addNamePhone(user);
                    System.out.println("\nЗапись добавлена: " + name + ": " + phoneNumber);
                    break;
                case 3:
                    System.out.print("ДОБАВЛЕНИЕ НОМЕРА ТЕЛЕФОНА\n\n");
                    System.out.print("Введите имя, для которого будете добавлять номер телефона: ");
                    name = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    phoneNumber = Integer.parseInt(scanner.nextLine());
                    Phonebook.addPhone(name, phoneNumber);
                    break;
                case 4:
                    System.out.print("УДАЛЕНИЕ НОМЕРА ТЕЛЕФОНА ИЛИ ИМЯ И ТЕЛЕФОНА\n\n");
                    System.out.print("Введите имя: ");
                    name = scanner.nextLine();
                    System.out.println("Выберете, что будете удалать:\n");
                    System.out.println("1. Всю записи");
                    System.out.println("2. Номер телефона");
                    System.out.println("3. Выйти");
                    del = Integer.parseInt(scanner.nextLine());
                    phoneNumber = 0;
                    if (del == 2) {
                        System.out.print("Введите номер телефона: ");
                        phoneNumber = Integer.parseInt(scanner.nextLine());
                    }
                    Phonebook.removePhone(name, phoneNumber, del);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("\nНекорректный выбор! Попробуйте снова.\n");
            }
        }
        System.out.println("\nРабота приложения завершена.\n");

    }
}