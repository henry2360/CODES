package chapterFourteen;


import java.util.Scanner;

public class ReversingAString {
    public static void main(String[] args) {
        ComparingIfStringsAreEqual c = new ComparingIfStringsAreEqual();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        String k = sc.next();
        System.out.println("enter your number");
        String y = sc.next();
        System.out.println(c.getUserInput(k, y));
    }
}