import java.util.ArrayList;
import java.util.Arrays;

/*
Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
Пример
a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{5, 1, 6, 2, 3, 4};
        System.out.println(Arrays.toString(mergeSort(a)));
    }

    public static int[] mergeSort(int[] a) {
        int n = a.length; if (n < 2) {
            return a;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        l = mergeSort(l);
        r = mergeSort(r);
        return merge(l, r);
    }

    public static int[] merge(int[] l, int[] r) {

        int left = l.length;
        int right = r.length;
        int[] a = new int[left + right];
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }

        return a;
    }
}