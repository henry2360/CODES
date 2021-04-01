package ourTddfiles;

public class BankAccount {

    private String firstName;
    private String secondName;
    private int accountNumber;
    private double accountBalance;
    private int pin = 2121;

    //private Bank bank;
    public BankAccount(){

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;

    }
   public void setSecondName(String secondName){
        this.secondName = secondName;

   }
   public  void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;

   }

   public String getFirstName(){
        return firstName;
   }
   public String getSecondName(){
        return secondName;

   }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
public void verifyPin(int pin){
        this.pin = pin;

}

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}

