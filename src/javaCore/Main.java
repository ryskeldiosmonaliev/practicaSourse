package javaCore;

public class Main {
    public static void main(String[] args) {
        System.out.println(25); // int
        System.out.println(25L);//long

        System.out.println(23.879); //double
        System.out.println(23.879F); // flout

        System.out.println('?'); //char
        System.out.println("Ryskeldi"); //String
        Lesson8Runner lesson8Runner = new Lesson8Runner();
        String string = new String();


        System.out.println(false); //boolean


        //литералы константы которые мы исползуем java

     int [] array = {1,2,3,4,5};
     int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[max]<array[i]){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}