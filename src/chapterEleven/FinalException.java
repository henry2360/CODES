package chapterEleven;

public class FinalException {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {10, 20, 30};
            System.out.println(myNumbers[100]);
        } catch (java.lang.Exception e) {
            System.out.println("YOU BE WEREY.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}


