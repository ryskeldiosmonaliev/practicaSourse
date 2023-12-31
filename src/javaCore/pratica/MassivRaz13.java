package javaCore.pratica;
/**
 * Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17, и печатающую его.
 */
public class MassivRaz13 {
    public static void main(String[] args) {
        int[] values = new int[100];
        MaasivObratnomPordke.printArray(values);
        fillArray(values);
        MaasivObratnomPordke.printArray(values);
    }

    private static void fillArray(int[] values) {
//        1 2 3 4 5 ... 13 14 15 .. 17 .. 20 21 ... 26
//        int currentIndex = 0;
        for (int currentValue = 1, currentIndex = 0; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex++] = currentValue;
//                currentIndex++;
            }
        }
    }
}
