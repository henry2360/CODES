package chapterFour;

public class WhileLoop {
    public static void main(String[] args) {
        int numberOfPrints = 0;

        while(numberOfPrints < 100){
            if (numberOfPrints % 2 == 0)
                System.out.println(numberOfPrints);
            numberOfPrints = numberOfPrints+ 1;
        }
    }
}
