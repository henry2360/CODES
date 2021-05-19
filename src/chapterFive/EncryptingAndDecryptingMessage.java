package chapterFive;

    public class EncryptingAndDecryptingMessage {
        public  int encryptingMessage(int message){

            int firstDigit=(message/1000+7)%10;
            int secondDigit=(((message%1000)/100)+7)%10;
            int thirdDigit=(((message%1000)%100/10)+7)%10;
            int fourthDigit=((message%1000%100%10)+7)%10;

            thirdDigit*=1000;
            fourthDigit*=100;
            firstDigit*=10;

            return thirdDigit+fourthDigit+firstDigit+secondDigit;
        }
        public  int decryptingMessage(int message){
            int firstDigit=message/1000;
            int secondDigit=(message%1000)/100;
            int thirdDigit=((message%1000)%100)/10;
            int fourthDigit=((((message%1000)%100)%10)%10);
            if(firstDigit<=7){
                firstDigit+=10-7;
            }else firstDigit-=7;

            if(secondDigit<=7){
                secondDigit+=10-7;
            }else secondDigit-=7;


            if(thirdDigit<=7){
                thirdDigit+=10-7;
            }else thirdDigit-=7;

            if(fourthDigit<=7){
                fourthDigit+=10-7;
            }else fourthDigit-=7;

            thirdDigit*=1000;
            fourthDigit*=100;
            firstDigit*=10;
            return thirdDigit+fourthDigit+firstDigit+secondDigit;
        }
        public static void main(String[] args) {
            EncryptingAndDecryptingMessage sc=new EncryptingAndDecryptingMessage();
            System.out.println( sc.encryptingMessage(2345));
            System.out.println(sc.decryptingMessage(1290));

        }
    }

