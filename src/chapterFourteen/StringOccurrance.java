package chapterFourteen;
import java.util.Scanner;
public class StringOccurrance {

        public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);
            System.out.println("Enter you sentence");
            String s=sc.nextLine();
            StringBuilder sk=new StringBuilder(s);
            char c=s.charAt(0);
            int counter=0;
            while (counter<s.length()){
                if (Character.isLetter(c)) {
                    System.out.println(Character.isDigit(c));
                    break;
                }
                counter++;
            }
            System.out.println(counter);
            //  System.out.println(s.hashCode());

        }
    }


