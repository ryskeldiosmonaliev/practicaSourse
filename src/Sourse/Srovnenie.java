package Sourse;

import java.util.Scanner;

/**
 * 32. Напишите программу на Java для сравнения двух чисел. Перейти к редактору
 * Входные данные:
 * Введите первое целое число: 25
 * Введите второе целое число: 39
 * Ожидаемый результат
 * <p>
 * 25! = 39
 * 25 <39
 * 25 <= 39
 */
public class Srovnenie {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        int number1; // first number to compare
        int number2; // second number to compare

        System.out.print("Input first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Input second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user

        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
    }
}

