package chapterEleven;
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivideByZeroWithExceptionHandling {
    public static  int quotient(int numerator, int denominator)
        throws ArithmeticException
    {
        return numerator / denominator;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try {
                System.out.println("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false;

            } catch (IllegalArgumentException inputMismatchException) {
                System.err.printf("%nException: %s%n", inputMismatchException);
                scanner.nextInt();
                System.out.printf("You must enter integers. please try again.%n%n");

            } catch (ArithmeticException arithemeticException) {
                System.err.printf("%nException: %s%n", arithemeticException);
                System.out.printf("Zero is an invalid denominator.  Please try again WEREY!");
            }
        }while(continueLoop);

                }
            }






