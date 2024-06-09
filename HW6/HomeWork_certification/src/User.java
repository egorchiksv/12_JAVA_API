import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    public String name;
    public List<Integer> number;

    public User(String name, List<Integer> number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getNumber() {
        return (ArrayList<Integer>) number;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
