import java.util.LinkedList;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
//        List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
//        System.out.println(l);
//        System.out.println(l.get(4));
//
//        lesson3.Animal a = new lesson3.Animal("d", "b");
//        lesson3.Animal b = new lesson3.Animal("d", "b");
//        b.foo();
//        System.out.println(a);
//        List<List<Integer>>; // аналог двумерного массива
        List<Integer> l = new LinkedList<>();
        l.addAll(List.of(1, 2, 3, 4));
        System.out.println(l);
        System.out.println(l.get(2));
        l.remove(2);
    }
}
