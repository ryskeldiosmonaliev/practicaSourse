package javaCore.pratica;
/**
 * Имеется число. Посчитать сумму цифр данного числа.
 */
public class SumNumber {
    public static void main(String[] args) {
        //        12345 % 10 = 5 -> 12345 / 10 = 1234
        int value = -12345;
        int result = sum(value);
        System.out.println(result);
        System.out.println(sumWhile(value));

    }
    private static int sumWhile(int value) {
        int result = 0;
        int currentValue = (value > 0 ? value : value * -1);
        while (currentValue > 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }

        return result;
    }

    private static int sum(int value) {
        int result = 0;
        for (int currentValue = (value > 0 ? value : value * -1); currentValue > 0; currentValue /= 10) {
            result += currentValue % 10;
        }

        return result;
    }
}
