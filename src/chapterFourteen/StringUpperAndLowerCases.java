package chapterFourteen;

import java.util.Locale;
import java.util.Scanner;

public class StringUpperAndLowerCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User input");
        String txt = scanner.nextLine();
          System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
    }
}
