package ourTddfiles;

public class Account {
    private double balance;
    private int pin;

    public void depositMoney(double amount) {
        if (amount >= 0) {
            balance = balance + amount;
        }
    }
    public double getAccountBalance() {
        return balance;
    }
    public void setPin(int newPin) {
        pin = newPin;
    }
    public void withdrawMoney(double amountToWithdraw, int pin) {
        if (pin == this.pin)
            balance = balance - amountToWithdraw;
    }
}
