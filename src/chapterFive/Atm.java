package chapterFive;

public class Atm {


    private double balance;
    private int pin;

    public Atm(int pin) {
        this.pin = pin;
//        if (balance > 0.0) {
//            this.balance = balance;
//        }

    }

    public void setPin(int pin) {
        this.pin = pin;
    }


    public double getBalance() {
        return balance;
    }

    public void withdrawMoney(double amount) {
        if (balance >= amount) {
            this.balance -= amount;

        }
    }

    public void transferMoney(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        }

    }

    public void buyAirtime(int amount) {
        if (balance >= amount) {
            this.balance -= amount;
        }

    }
        public void depositMoney (double amount){
            if (amount > 0) {
                this.balance += amount;
            }

            }

            public int getPin(){
                return pin;
            }





    }

