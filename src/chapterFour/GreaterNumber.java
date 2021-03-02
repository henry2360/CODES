package chapterFour;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int number1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int number2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int number10 = in.nextInt();


        if (number1 > number2)
            if (number1 > number10)
                System.out.println("The greatest: " + number1);

        if (number2 > number1)
            if (number2 > number10)
                System.out.println("The greatest: " + number2);

        if (number10 > number1)
            if (number10 > number2)
                System.out.println("The greatest: " + number10);
    }
}

