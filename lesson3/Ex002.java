package lesson3;

import java.util.ArrayList;

public class Ex002 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList list = new ArrayList();
        list.add(2809);
        list.add("1234");

        for (Object o : list) {
            System.out.println(o);
        }
    }

}
