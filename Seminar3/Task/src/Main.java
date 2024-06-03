public class Main {
    public static void main(String[] args) {
        isEqual(s1, s6);
    }

    Object object = new Object();
    static String s1 = "hello";
    static String s2 = "hello";

    static String s3 = s1;
    static String s4 = "h" + "e" + "l" + "l" + "o";
    static String s5 = new String("hello");
    static String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

    public static void change() {s1 = "ok";}
    public static void isEqual(String arg0, String arg1) {
//        s1 = s1 + "ldfjghoaergb";
        if (arg0 == arg1) {
            System.out.println("Равны как ссылки");
        } else if (arg0 != arg1) {
            System.out.println("Не равны как ссылки");
        }
        if (arg0.equals(arg1)) {
            System.out.println("Равны как значения");
        } else if (!arg0.equals(arg1)) {
            System.out.println("Не равны как значения");
        }
    }
}