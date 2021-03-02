package chapterFour;
import java.util.Scanner;

public class ScoreTest {

        public static void main (String[] args){

            Scanner input =new Scanner(System.in);
            double grade;

            System.out.println("Enter grade");
            grade =input.nextDouble();


            if (grade >=0 && grade <= 100){
                if (grade >= 90){
                    System.out.println ("A");
                }
                else
                if (grade <=89 && grade <= 79){
                    System.out.println ("B");
                }

                else
                if (grade <=79 && grade <=69){
                    System.out.println ("C");
                }
                else
                if (grade <=69 && grade <=59){
                    System.out.println ("D");
                }
                else
                if (grade <=59 && grade <= 49){
                    System.out.println ("E");
                }
            }


            else {
                System.out.println ("Invalid input");
            }
        }
    }





