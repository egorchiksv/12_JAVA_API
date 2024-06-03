/*
Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort).
Программа должна работать следующим образом:
Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по
умолчанию.
Сначала выводить исходный массив на экран.
Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
Выводить отсортированный массив на экран.
Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива,
и heapSort, который выполняет собственно сортировку кучей.
Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.
На входе:
'5 8 12 3 6 9'
На выходе:
Initial array:
[5, 8, 12, 3, 6, 9]
Sorted array:
[3, 5, 6, 8, 9, 12]
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] initArray;
        initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));

        heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }

//    public static void buildTree(int[] tree, int i, int sortLength) {
//        //левый ребёнок
//        int left = i * 2 + 1;
//
//        //правый ребёнок
//        int rigth = i * 2 + 2;
//
//        //Инициализируем наибольший элемент как корень
//        int max = i;
//
//        //Проверка чтоб дети не стали больше чем родители
//        //Если левый дочерний элемент больше корня
//        if(left < sortLength && tree[left] > tree[max])
//            max = left;
//
//        //Если правый дочерний элемент больше,
//        // чем самый большой элемент на данный момент
//        if(rigth < sortLength && tree[rigth] > tree[max])
//            max = rigth;
//
//        //Если, ребёнок оказался больше родителя, то делаем обмен,
//        //ребёнка с родителем. Если самый большой элемент не корень
//        if (i != max) {
//            int temp = tree[i];
//            tree[i] = tree[max];
//            tree[max] = temp;
//
//            //Проверяем ещё раз чтоб дети были меньше чем родители,
//            //если, вдруг у детей есть свои дети
//            //Рекурсивно преобразуем в двоичную кучу затронутое поддерево
//            buildTree(tree, max, sortLength);
//        }
//    }
//
//    public static void heapSort(int[] sortArray, int sortLength) {
//        for(int i  = sortLength / 2 - 1; i >= 0; i--)
//            buildTree(sortArray, i , sortLength);
//
//        //Делаем сортировку массива, уже отсортированного дерева,
//        //Один за другим извлекаем элементы из кучи
//        for (int i = sortLength - 1; i >= 0; i--){
//
//            // Перемещаем текущий корень в конец
//            int temp = sortArray[i];
//            sortArray[i] = sortArray[0];
//            sortArray[0] = temp;
//
//            // Вызываем процедуру heapify на уменьшенной куче
//            buildTree(sortArray, 0, i);
//        }
//    }

//*******************************************************************************
public static void buildTree(int[] tree, int sortLength) {
    // Для всех вершин дерева начиная с середины сортируемой части массива
    // (движемся влево до нулевого индекса)
    for (int i = sortLength / 2 - 1; i >= 0; i--) {
        int maxIndex;
        // Если у вершины два листа, выбираем больший
        if (i * 2 + 2 <= sortLength - 1) {
            if (tree[i * 2 + 2] > tree[i * 2 + 1]) maxIndex = i * 2 + 2;
            else maxIndex = i * 2 + 1;
            // Иначе один лист
        } else maxIndex = i * 2 + 1;
        // Сравниваем лист с максимальным значением с вершиной, при большем значении
        // дочернего элемента меняем его местами с вершиной
        if (tree[i] < tree[maxIndex]) {
            int temp = tree[i];
            tree[i] = tree[maxIndex];
            tree[maxIndex] = temp;
        }
    }
}

    public static void heapSort(int[] sortArray, int sortLength) {
        // Выход из рекурсии: длина сортируемой части равна 0
        if (sortLength == 0) return;
        // Выстраивание элементов части массива в виде сортирующего дерева
        buildTree(sortArray, sortLength);
        // Замена местами первого и последнего элемента в сортируемой части
        int temp = sortArray[0];
        sortArray[0] = sortArray[sortLength - 1];
        sortArray[sortLength - 1] = temp;
        // Рекурсивно построение дерева и замена элементов для n - 1 элементов массива
        heapSort(sortArray, sortLength - 1);
    }
}