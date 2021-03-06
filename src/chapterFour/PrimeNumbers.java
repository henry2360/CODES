package chapterFour;

public class PrimeNumbers {
    public static void main(String[] args) {
        int number =0;
        while(number < 100){
            if (number % 2 !=0 )
                System.out.println( number);
            number=number+1;
        }
    }

}
