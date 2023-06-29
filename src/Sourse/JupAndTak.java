package Sourse;

import java.util.Scanner;

/**49. Напишите программу на Java, которая принимает число и проверяет, является ли число четным или нет. Печатает 1, если число четное, или 0, если число нечетное. Перейти к редактору
 Пример вывода:

 Введите число: 20
 1*/
public class JupAndTak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        if (number%2==0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
