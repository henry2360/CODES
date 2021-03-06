package chapterFour;
  import java.util.Scanner;

public class MinAndMaxNumber{


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int i;

            System.out.print("Enter integer:");
            int numbers = input.nextInt();
            int smallest = numbers;
            int largest = numbers;

            for (i = 1; i < 10 ; i++) {
                System.out.print("Enter integer:");
                numbers = input.nextInt();
                if(numbers > largest){
                    largest = numbers;
                }
                if (numbers < smallest) {
                    smallest = numbers;
                }
            }
            System.out.println("Smallest = " + smallest);
            System.out.println("Largest = " + largest);
        }
    }

