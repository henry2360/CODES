package Tdd;

import java.util.ArrayList;

public class Bank {
    private final ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    private int nextAccountNumber = 1000;

    public void createAnAccount(String firstName,String secondName){
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.setFirstName(firstName);
        myBankAccount.setFirstName(firstName);
        // myBankAccount.setAccountNumber(12345);

        myBankAccount.setAccountNumber(nextAccountNumber);
        nextAccountNumber++;

        bankAccounts.add(myBankAccount);
    }

    public int getTotalAccounts() {
        return bankAccounts.size();
    }

    public ArrayList<BankAccount> retrieveAllAccounts() {
        return bankAccounts;
    }

    public BankAccount retrieveAccountWithNumber(int accountNumber) {
        for (BankAccount account:bankAccounts) {
             if (account.getAccountNumber() == accountNumber) return account;
        }
        return null;
    }

    public void deposit(double amount, int accountNumber) {
        BankAccount account = retrieveAccountWithNumber(accountNumber);
        boolean moneyCanBeDeposited = account != null && amount > 0;
        if (moneyCanBeDeposited) {
            double accountBalance = account.getAccountBalance();
            accountBalance += amount;
            account.setAccountBalance(accountBalance);
        }
    }

    public double getAccountBalance(int accountNumber) {
        BankAccount account = retrieveAccountWithNumber(accountNumber);
        if (account != null) return account.getAccountBalance();
        else return 0;
    }

//    public void withdraw(int amount, int pin) {
//        if(amount > 0.00 && pin == pin){
//            accountBalance -= amount;
//        }
    }
//public int getTotalAccount(){
//        return totalAccount++;
//}

//    public int accountNumber() {
//        return 12345;
//    }
