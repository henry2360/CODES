package kata;
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int result;
        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        result = number1 * number2 * number3;
        System.out.printf("Product is %d%n", result);

    }


}
