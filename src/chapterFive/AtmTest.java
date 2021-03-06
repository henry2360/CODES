package chapterFive;

import java.util.Scanner;

public class AtmTest {
    public static void main(String[] args) {

            Scanner peters = new Scanner(System.in);
            Atm myAtm = new Atm(1234);
            int hPin = myAtm.getPin();
            System.out.println("kindly insert pin");
            int pin = peters.nextInt();

            if (hPin == pin) {

                System.out.println("welcome back");
                  for (int reader = 1;  reader<=3; reader++){
                String message = """
                                           
                        ->To buy Airtime, press 1
                        ->To deposit press 2
                        ->To withdraw press 3
                        ->To transfer money press 4
                        ->To check balance press 5
                        ->To change Pin 6
                        ->To End Transaction Press 7               
                                           
                                           
                                           
                        """;
                System.out.println(message);
                System.out.println("choose your preferred option");
                int peter = peters.nextInt();
                switch (peter) {
                    case 1:
                        System.out.println("Enter airtime amount");
                        int airtime = peters.nextInt();
                        myAtm.buyAirtime(airtime);
                        System.out.println("Your account balance is " + myAtm.getBalance());
                        break;
                    case 2:
                        System.out.println("Enter deposit amount");
                        int deposit = peters.nextInt();
                        myAtm.depositMoney(deposit);
                        System.out.println("Your account balance is " + myAtm.getBalance());
                        break;
                    case 3:
                        System.out.println("Enter withdraw amount");
                        int withdraw = peters.nextInt();
                        myAtm.withdrawMoney(withdraw);
                        System.out.println("Your account balance is " + myAtm.getBalance());
                        break;
                    case 4:
                        System.out.println("Enter transfer amount");
                        int transfer = peters.nextInt();
                        myAtm.transferMoney(transfer);
                        System.out.println("Your account balance is " + myAtm.getBalance());
                        break;
                    case 5:
                        System.out.println("Your account balance is " + myAtm.getBalance());
                        break;
                    case 6:
                        System.out.println("Enter new pin");
                        int newPin=peters.nextInt();
                        myAtm.setPin(newPin);
                        break;
                    case 7:
                        reader = reader + 5000;
                    default:
                        System.out.println("Transaction Ended");
                }
                  }



            } else {
                System.out.println("Your PIN is INVALID!");
            }



        }
    }

