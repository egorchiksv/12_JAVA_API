import java.util.LinkedList;

/*+
В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди
dequeue() - возвращает первый элемент из очереди и удаляет его
first() - возвращает первый элемент из очереди, не удаляя
getElements() - возвращает все элементы в очереди
Пример
queue.enqueue(1);
queue.enqueue(10);
queue.enqueue(15);
queue.enqueue(5);
System.out.println(queue.getElements());
Результат:
[1, 10, 15, 5]
queue.dequeue();
queue.dequeue();
System.out.println(queue.getElements());
Результат:
[15, 5]
System.out.println(queue.first());
Результат:
15
 */
public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);
        System.out.println(queue.getElements());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
    }

    static class MyQueue<T> {
        LinkedList<T> list = new LinkedList<>();
        public void enqueue(T element){
            list.add(element);
        }

        public T dequeue(){
            return list.removeFirst();
        }

        public T first(){
            return list.getFirst();
        }

        public LinkedList<T> getElements() {
            return list;
        }
    }
}