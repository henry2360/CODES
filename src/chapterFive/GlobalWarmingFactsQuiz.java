package chapterFive;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    Scanner sc=new Scanner(System.in);

    int score =0;


    public int askQuestions(int userInput) {

        switch (userInput) {
            case 1:
                System.out.println(questionOne);
                System.out.println("Enter you answer");
                String answer1=sc.next();
                if (answer1.equalsIgnoreCase("A"))
                    score++;




            case 2:

                System.out.println(questionTwo);
                System.out.println("Enter you answer");
                String answer2=sc.next();
                if (answer2.equalsIgnoreCase("B"))
                    score++;

            case 3:
                System.out.println(questionThree);
                System.out.println("Enter you answer");
                String answer3=sc.next();
                if (answer3.equalsIgnoreCase("C"))
                    score++;

            case 4:
                System.out.println(questionFour);
                System.out.println("Enter you answer");
                String answer4=sc.next();
                if (answer4.equalsIgnoreCase("D"))
                    score++;

            case 5:
                System.out.println(questionFive);
                System.out.println("Enter you answer");
                String answer5=sc.next();
                if (answer5.equalsIgnoreCase("D"))
                    score++;
        }
        System.out.println(score(score));
        return score;
    }

    String questionOne= """
        1.who is the first goat ever
        A.Billy Goat
        B.Andon Ray
        C.Polly Kim
        D.Shaggy Rabi
        """;
    String questionTwo= """
        2.who is the first goat ever
        A.Billy Goat
        B.Andon Ray
        C.Polly Kim
        D.Shaggy Rabi
        """;

    String questionThree= """
        3.who is the shortest goat ever
        A.Billy Goat
        B.Andon Ray
        CPolly Kim
        D.Shaggy Rabi
        """;

    String questionFour= """
        4.who is the smallest goat ever
        A.Billy Goat
        B.Andon Ray
        C.Polly Kim
        D.Shaggy Rabi
        """;
    String questionFive= """
        5.who is the biggest goat ever
        A.Billy Goat
        B.Andon Ray
        C.Polly Kim
        D.Shaggy Rabi
        """;
    public static String score(int score){
        if (score==5){
            return"Excellent";
        }
        else if (score==4){
            return"Very Good";
        }
        else if (score ==3){
            return"nice try";
        }
        else
            return "Time to brush up your knowledge on global warming";
    }


    public static void main(String[] args) {
        GlobalWarmingFactsQuiz globalWarmingFactsQuiz=new GlobalWarmingFactsQuiz();
        System.out.println("You scored is:  "+globalWarmingFactsQuiz.askQuestions(1));

    }
}


