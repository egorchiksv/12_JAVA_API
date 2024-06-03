import java.util.HashMap;
import java.util.Map;

public class Ex001_HashMap {

    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(null, "!null");
        System.out.println(db);
        System.out.println(db.get(44));
        System.out.println(db);
        System.out.println(db.containsValue("один"));

        System.out.println(db.containsKey(1));
        System.out.println(db.keySet());
        System.out.println(db.values());
    }
}