package HomeWork_1;

import java.util.Scanner;

// ----------------------------------------------------------------
// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class program {

    public static void main(String[] args) {
        // System.out.println(Factorial(5));
        // TriangleNumber(6);
        // PrimeNumbers(1000);
        Calculator(args);
    }

    public static int Factorial(int n) { // факториал числа
        if (n == 1)
            return n;
        return Factorial(n - 1) * n;
    }

    public static void TriangleNumber(int n) { // расчет треугольного числа
        System.out.println((n) * (n + 1) / 2);
    }
    // -------------------------------------------------------
    // 2. Вывести все простые числа от 1 до 1000

    public static void PrimeNumbers(int n) {

        for (int i = 1; i <= n; i++) {
            boolean isPrime = true; // флаг
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++) {// если число i не простое,то хотябы один делитель
                                                                 // будет находится в промежутке от 2 до sqrt(i)
                if ((i % j) == 0) { // Если j - делитель числа, устанавливаем флаг на false
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");// если делителей нет, то флаг не изменится
            }
        }
        System.out.println();
    }

    // -------------------------------------------------
    // * 3. Реализовать простой калькулятор
    public static void Calculator(String[] arr) {

        float num1, num2, res;

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
                res = num1 + num2;
                System.out.println(res);
                break;

            case "-":
                res = num1 - num2;
                System.out.println(res);
                break;

            case "*":
                res = num1 * num2;
                System.out.println(res);
                break;

            case "/":
                if (num2 == 0)
                    System.out.println("На 0 делить нельзя!");
                else {
                    res = num1 / num2;
                    System.out.println(res);
                }
                break;

            default:
                System.out.println("Выберайте из возможных действий: +, -, *, /");
        }
    }

    /*
     * 4*. Задано уравнение вида q + w = e, q, w, e >= 0.
     * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
     * Требуется восстановить выражение до верного равенства.
     * Предложить хотя бы одно решение или сообщить, что его нет.
     */
}