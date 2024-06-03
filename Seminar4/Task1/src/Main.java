public class Main {
    public static void main(String[] args) {
        mystack stack = new mystack();
        System.out.println(stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(1);
        stack.push(1);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.empty());
    }
}
