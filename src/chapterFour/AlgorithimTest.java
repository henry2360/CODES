package chapterFour;

import java.util.Scanner;



    public class AlgorithimTest{

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            double score;

            System.out.println("Enter score");
            score = input.nextDouble();

            if (score >= 40){
                System.out.println ("passed!");
            }
            if (score < 40 ){
                System.out.println("failed");
            }

        }

}
