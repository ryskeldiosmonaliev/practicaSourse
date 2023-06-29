import java.util.Arrays;

public class mains {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int temp;
        for (int k = 0; k < array.length; k++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(array));
    }

}

