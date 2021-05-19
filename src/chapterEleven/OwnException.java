package chapterEleven;

public class OwnException {

    public static <Exceptions> void main(String[ ] args){
        try{
          int []  myNumber = {1, 2, 3};
            System.out.println(myNumber[10]);
        }catch (java.lang.Exception e) {
            System.out.println("YOU ARE MAD!");
        }
    }
}
