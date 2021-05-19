package chapterSix;

public class MinimumNumber {

        public static int minimumNumbers(int firstNumber,int secondNumber,int thirdNumber,int fourthNumber,int fifthNumber) {
            return Math.min(firstNumber, (Math.min(secondNumber,Math.min(fourthNumber,fifthNumber))));

        }

        public static void main(String[] args) {
            System.out.println( minimumNumbers(2,54,23,45,67));
        }

    }



