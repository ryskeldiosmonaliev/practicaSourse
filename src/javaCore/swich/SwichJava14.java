package javaCore.swich;

public class SwichJava14 {
    public static void main(String[] args) {
        var mouth = 1;
        var result = switch (mouth) {
            case 12, 1, 2 -> "Winter";

            case 3, 4, 5 -> "Spring";

            case 6, 7, 8 -> "Summer";

            case 9, 10, 11 -> "Autumn";

            default -> "Moutn is invalid";
        };
        System.out.println(result);
    }
}
