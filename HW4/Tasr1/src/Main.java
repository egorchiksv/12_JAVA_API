import javax.swing.*;
import java.util.LinkedList;

/*
Дан LinkedList с несколькими элементами разного типа. В методе revert класса LLTasks реализуйте разворот этого
списка без использования встроенного функционала.
Пример
// Дан
[1, One, 2, Two]
// Вывод
[1, One, 2, Two]
[Two, 2, One, 1]
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");

        System.out.println(ll);
        System.out.println(revert(ll));
//        LinkedList<Object> reversedList = answer.revert(ll);
//        System.out.println(reversedList);
    }

    public static LinkedList<Object> revert(LinkedList<Object> ll) {
//        LinkedList<Object> ll1 = new LinkedList<>();
//        for (int i = ll.size()-1; i >= 0; i--) {
//            ll1.add(ll.get(i));
//        }
//        return ll1
        //---------------------------
//        return ll.reversed();
        //----------------------------
        int size = ll.size();
        for (int i = 0; i < size / 2; i++) {
            Object temp = ll.get(i);
            ll.set(i, ll.get(size - i - 1));
            ll.set(size - i - 1, temp);
        }
        return ll;
    }
}