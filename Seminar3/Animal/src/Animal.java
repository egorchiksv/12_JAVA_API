package lesson3;

public class Animal {
    String bread;
    String name;
    int age;

    public Animal(String bread, String n) {
        this.bread = bread;
        name = n;
        age = 1;
    }

    /**
     * Метод, который ничего не делает
     * @return
     */
//    public void foo();

    @Override
    public String toString() {
        return "Animal{" +
                "bread=" + bread + '\'' +
                ", name=" + name + '\'' +
        '}';
    }
}