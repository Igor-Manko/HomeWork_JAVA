package HomeWork_3;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.logging.Logger;

public class MinMaxArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-2);
        list.add(-6);
        list.add(66);
        list.add(31);
        list.add(15);
        list.add(-15);
        list.add(7);

        System.out.println("Начальный список: " + list);

        int min = list.get(0);
        int max = list.get(0);

        for (Integer i : list) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }

        OptionalDouble average = list.stream().mapToInt(e -> e).average();

        // System.out.println("минимальное число: " + min);
        // System.out.println("максимальное число: " + max);
        // System.out.println("среднее число: " + mean);
        Logger logger = Logger.getAnonymousLogger();
        logger.info(String.valueOf("минимальное число: " + min));
        logger.info(String.valueOf("максимальное число: " + max));
        logger.info(String.valueOf("среднее значение всего списка: " + average.getAsDouble()));
    }
}
