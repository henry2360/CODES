package chapterFour;

public class encryption {
    public static int encrypt(int message){
        int encryptedMessage = 0;
        int firstDigit = message/1000;
        firstDigit +=7;
        firstDigit %= 10;

        message = message % 1000;
        int secondDigit =message % 1000/100;
        secondDigit +=7;
        secondDigit %= 10;

        message = message % 100;
        int thirdDigit = message /10;
        thirdDigit +=7;
        thirdDigit %=10;

        int fourthDigit = message % 10;
        fourthDigit +=7;
        fourthDigit %=10;

        thirdDigit *= 1000;
        fourthDigit *= 100;
        firstDigit *=10;

        firstDigit *= 18;


        return encryptedMessage;
    }

}
