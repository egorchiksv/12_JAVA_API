package lesson6.Task1;
import java.until.Formater;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("id:%d fn:%s ln:%d s:%d", id, firstName, lastName, salary);
    }
}
