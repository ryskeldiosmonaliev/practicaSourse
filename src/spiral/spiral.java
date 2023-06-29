package spiral;

import java.util.Scanner;
/**
 * делает матрицу в спирпли N*N
 * @author Рыскелди
 * */

public class spiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("выбери число N*N: ");

        int N = scanner.nextInt();
        int a = 1;

        int[][] arr = new int[N][N];
        for (int delta = 0; delta < N - 2; delta++) {

            for (int i = delta; i < N - delta; i++) {
                arr[delta][i] = a;
                a++;
            }
            for (int i = delta; i < N - delta; i++) {
                arr[i][N - 1 - delta] = a;
                a++;
            }
            a--;
            for (int i = N - 1 - delta; i >= delta; i--) {
                arr[N - 1 - delta][i] = a;
                a++;
            }
            a--;
            for (int i = N - 1 - delta; i >= 1 + delta; i--) {
                arr[i][delta] = a;
                a++;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
    }

