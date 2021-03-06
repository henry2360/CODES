package chapterFour;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        Scanner henry =new Scanner(System.in);
        int myNumber = 20;
        int yourNumber = 0;

        while(yourNumber != myNumber) {
            System.out.println("your Number?");
            yourNumber = henry.nextInt();

            if(yourNumber == myNumber){
                System.out.println(yourNumber + " is the correct number");
            }

            if(yourNumber < myNumber){
                System.out.println(yourNumber + " is lesser than my number");
            }

            if(yourNumber > myNumber){
                System.out.println(yourNumber + " is greater than my number");
            }
        }


        //System.out.println(yourNumber);

    }
}
