package ourTddfiles;

public class Calculator<numerator, denominator> {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber - firstNumber;
        }
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(int numerator, int denominator) {
        if (denominator == 0) {
            return 0;
        }
        return numerator / (denominator * 1.0);
    }

}