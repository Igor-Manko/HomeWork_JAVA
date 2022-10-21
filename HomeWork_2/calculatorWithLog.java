package HomeWork_2;

import java.util.Scanner;
import java.util.logging.Logger;

public class calculatorWithLog {
    public static void main(String[] args) {
        Calculator(args);

    }

    public static void Calculator(String[] arr) {

        float num1, num2;
        String result = "";


        Scanner input = new Scanner(System.in); // сканер ввода чисел
        System.out.println("Введите первое число: ");
        num1 = input.nextFloat();
        System.out.println("Введите второе число: ");
        num2 = input.nextFloat();

        Scanner op = new Scanner(System.in); // сканер операции
        System.out.println("Введите операцию");
        String operation = op.next();
        input.close();
        op.close();

        switch (operation) {
            case "+":
                result = "" + (num1 + num2);
                System.out.println(result);
                break;

            case "-":
                result = "" + (num1 - num2);
                System.out.println(result);
                break;

            case "*":
                result = "" + (num1 * num2);
                System.out.println(result);
                break;

            case "/":
                if (num2 == 0)
                    System.out.println("На 0 делить нельзя!");
                else {
                    result = "" + (num1 / num2);
                    System.out.println(result);
                }
                break;

            default:
                System.out.println("Выберайте из возможных действий: +, -, *, /");

                Logger logger = Logger.getAnonymousLogger();
                logger.info(operation);

        }
    }
}
