package javaCore.array;

public class Massiv {
    public static void main(String[] args) {
      int[][] values= new int[3][4];
      int[][] values2= new int[3][];
      values2[0]=new int[7];
      values2[0][3]=97;
        System.out.println(values.length);//3
        System.out.println(values[1].length);//4
        System.out.println(values[1][3]);//0

        System.out.println(values2.length);//3
        System.out.println(values2[1]);
        System.out.println(values2[0]);
        System.out.println(values2[0].length);
        System.out.println(values2[0][1]);//0
        System.out.println(values2[0][3]);//97
    }

    private static void dvamernyiMassiv() {
        int [][]values = {
                {-1,0},
                null,
                {8,64,34,-6},
                {}
        };
        System.out.println(values.length);//4
        System.out.println(values[0].length);//2
        System.out.println(values[0][1]);//0
        System.out.println(values[2][2]);//34
        System.out.println(values[1]);//null
    }

    private static void example2() {
        int[] values = new int[3]; //[0,0,0]
        char[] values2 = new char[3]; //[0,0,0]
        System.out.println(values2[1]);
    }

    private static void exalple() {
        int [] values = {1,6,9,-34,5};
        System.out.println(values.length);
        values [4] = 724;
        System.out.println(values[4]);
    }
}
