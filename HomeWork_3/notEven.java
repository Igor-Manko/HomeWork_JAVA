package HomeWork_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class notEven {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(27);
        numbers.add(4);
        numbers.add(15);
        numbers.add(22);
        numbers.add(16);
        System.out.println("Начальный список: " + numbers);

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer numberEven = iterator.next();
            if (numberEven % 2 == 0) {
                // System.out.println("Четное число в списке: " + numberEven);
                iterator.remove();
            }
        }
        // System.out.println("Список нечетных чисел: " + numbers);
        Logger logger = Logger.getAnonymousLogger();
        logger.info(String.valueOf(numbers));
    }
}
