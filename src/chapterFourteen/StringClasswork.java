package chapterFourteen;
import java.util.Arrays;
public class StringClasswork {
    public static void main(String[] args) {
        String a ="686573565234";
        System.out.print("(+");
        for (int count=9;count<12;count++){
            System.out.print(a.charAt(count));
        }
        System.out.print(") ");
        for (int count=6;count<9;count++){
            System.out.print(a.charAt(count));
        }
        System.out.print("-");
        for (int counter=5;counter>=3;counter--){
            System.out.print(a.charAt(counter));
        }
        System.out.print("-");
        for (int counter=1;counter<=2;counter++){
            System.out.print(a.charAt(counter));
        }

    }

}



