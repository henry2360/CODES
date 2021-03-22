package ChapterSeven;

public class Kata {
    public static void main(String[] args) {

        int[] array = {
                0,
                70,
                20,
                35,
                43,
                55};

        System.out.printf("%s%8s%n", "index", "value");

        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}