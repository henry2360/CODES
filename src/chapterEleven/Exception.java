package chapterEleven;

public class Exception extends Throwable {
  static void checkAge(int age){
      if (age < 21){
          throw new ArithmeticException("Acess denied - you must be at least 18 years old.");
      }
      else {
          System.out.println("Acess granted - you are old enough!");
      }
  }
  public static void main(String[] args){
      checkAge(22);
//       checkAge(15);
  }
}
