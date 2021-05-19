package chapterTwo;

public class Rate {
    public static void main(String[] args) {

        long worldPopulation = 7800000000L;


        double Rate = (1.1 / 100) + 1;

        System.out.printf("The world population after the first year is %f%n", worldPopulation * Rate);

        System.out.printf("The world population after the second year is %f%n", worldPopulation * Rate * Rate);
        System.out.printf("The world population after the third year is %f%n", worldPopulation * Rate * Rate * Rate);
        System.out.printf("The world population after the fourth year is %f%n", worldPopulation * Rate * Rate * Rate * Rate);
        System.out.printf("The world population after the fifth year is %f%n", worldPopulation * Rate * Rate * Rate * Rate * Rate);


    }
}



