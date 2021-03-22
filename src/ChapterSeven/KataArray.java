package ChapterSeven;

public class KataArray {

    public static void main(String[] args) {

        int[] array = new int[6];
        array[0] = 30;
        array[1] = 20;
        array[2] = 24;
        array[3] = 25;
        array[4] = 27;
        array[5] = 10;



        System.out.printf("%s%5s%n", "index", "value");

        for (int counter = 0; counter < array.length; counter++)


        System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}
