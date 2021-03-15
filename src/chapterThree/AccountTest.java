package chapterThree;
import java.util.Scanner;


public class AccountTest {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in) ;

    Account myAccount = new Account();

    System.out.printf("first name is: %s%n%n",myAccount.getName());

        System.out.println("please enter account name;");
         String theName = input.nextLine();
        myAccount.setName(theName);

        System.out.printf("Name in object myAccount is: %n%S%n", myAccount.getName());
    }


}
