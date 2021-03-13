package chapterFour;

import java.util.Arrays;
import java.util.Scanner;

public class ClassAverageSentinelLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print ("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;


            System.out.println("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        if (gradeCounter !=0){
            double average = (double)  total / gradeCounter;

            System.out.printf("nTotal of the %d grade entered is %d%n",gradeCounter,total);
            System.out.printf("Class average is % 2fn",average);

        }
            else
            System.out.println("no grades were entered");

        }



    }


