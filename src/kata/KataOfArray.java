package kata;

public class KataOfArray {


    public static void main(String[] args) {

        int[] numbers = {1, 5, -9, 12, -3, 89, 18, 23, 4, -6};
        System.out.println(getMinValue(numbers));


    }

    public static int getMinValue(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minimum > array[i])
                minimum = array[i];
        }
        return minimum;
    }

    public static int getSumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getAverage(int[] array) {
        return getSumOfArray(array) / array.length;

    }


    public static int getMaximum(int[] array) {
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maximum < array[i])
                maximum = array[i];

        }
        return maximum;
    }

    public static int maximumSumOfArray(int[] array) {
        int sum = getSumOfArray(array);
        int minimum = getMinValue(array);
        return sum - minimum;
    }

    public static int minimumSumOfArray(int[] array) {
        int sum = getSumOfArray(array);
        int maximum = getMaximum(array);
        return sum - maximum;
    }
}