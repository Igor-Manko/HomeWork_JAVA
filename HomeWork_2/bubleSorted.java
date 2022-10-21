package HomeWork_2;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Задание 2 - Реализуйте алгоритм сортировки пузырьком числового массива,
 * результат после каждой итерации запишите в лог-файл.
 */
public class bubleSorted {

    public static void main(String[] args) {
        int[] array = new int[] { 3, 5, 6, 1, 9, 8 };
        System.out.println("Исходный массив: " + Arrays.toString(array));
//        System.out.print(Arrays.toString(array) + " -> ");
        mySorted(array);
//        System.out.println(Arrays.toString(array));
        Logger logger = Logger.getAnonymousLogger();
        logger.info(String.valueOf(Arrays.toString(array)));
       
    }

    public static int[] mySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}