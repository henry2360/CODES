package chapterFourteen;

import java.util.Scanner;

public class ComparingIfStringsAreEqual {
    Scanner sc = new Scanner(System.in);

    public String getUserInput(String userInput1, String userInput2) {

        if (userInput1.regionMatches(0, userInput2, 0, 0)) {
            return userInput1;
        }
        return "sorry";
    }
}
