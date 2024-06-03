/*
Задание №3
📌 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 1, 1};

        int counter = 0;
        int max = 0;
        for(int i: array) {
            if(i == 1){
                counter++;
            }
            if(i == 0){
                if(counter != 0 ){
                    if(max < counter){
                        max = counter;
                    }
                    counter = 0;
                }
            }
        }
        if(counter != 0){
            if(max < counter){
                max = counter;
            }
        }
        System.out.println(max);
    }
}