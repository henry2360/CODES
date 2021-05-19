package chapterFive;

public class Diamond {
    public static void main(String[] args) {
        for (int counter = 1; counter < 9; counter += 2) {
            for (int space = 9; space >= counter; space -= 2) {
                System.out.print(" ");
            }
            for (int count = 1; count <= counter; count++) {
                System.out.print("*");
            }
            System.out.println();
        }



        for (int counter = 1; counter <= 9; counter += 2) {
            for (int space = 1; space <= counter; space += 2) {
                System.out.print(" ");
            }
            for (int count = 9; count >= counter; count--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}