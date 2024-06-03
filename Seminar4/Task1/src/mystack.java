/*
Задание №4
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
 */
public class mystack {
    private int capacity = 3;
    private int size = 0;
    private int[] array = new int[capacity];
    private int top = -1;

    private void addCapacity() {
        if (size == capacity) {
            capacity *= 2;
            int[] temp = new int[capacity];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
    }

    public boolean empty() {// проверка пустой ли стек
        return top == -1;
    }

    public int size() {// выводит размер стека
        return size;
    }

    public void push(int value) {// кладем в стек элемент
        addCapacity();
        array[++top] = value; // записываем элемент и говорим, что в стеке теперь есть элемент с текущим индексом
        size++;
    }

    public int peek() {
        return array[top];
    }

    public int pop() { // извлекаем элемент и удаляем его
        if(empty()){
            throw new RuntimeException("Stack is empty");
        }
        size--;// уменьшаем размер массива
        return array[top--]; // возвращаем вернхний элемент удаляем верхний элемент, т.е. верхний элемент делаем предыдущий
    }

    @Override
    public String toString() {
        if (empty()) return "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            builder.append(array[i]).append(", ");
        }

        builder.delete(builder.length() - 2, builder.length());
        return String.format("[%s]", builder);
    }
}