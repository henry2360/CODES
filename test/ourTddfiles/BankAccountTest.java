package ourTddfiles;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void bank_canGenerateAccount(){

     BankAccount myAccount = new BankAccount();
     assertNotNull(myAccount);

    }

    @Test
    void bank_canGenerateAccountNumber(){
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber(60182);
        assertEquals(myAccount.getAccountNumber(), 60182);

    }
     @Test
    void bank_canGetFirstName(){
         BankAccount myAccount = new BankAccount();
         myAccount.setFirstName("Chukwuebuka");
         assertSame("Chukwuebuka", myAccount.getFirstName());

    }
    @Test
    void bank_canGetSecondName(){
        BankAccount myAccount = new BankAccount();
        myAccount.setSecondName("Henry");
        assertEquals(myAccount.getSecondName(), "Henry");

    }



    @Test
    void bank_canGetAccountBalnace(){
        BankAccount myAccount = new BankAccount();
        assertEquals(myAccount.getAccountBalance(), 0);


    }
    @Test
    void Bank_canCreateBankAccount(){
      Bank myBank = new Bank();
    assertNotNull(myBank);
    }
    @Test
    void Bank_canCreateAnAccountOfItsOwn(){
        Bank myBank = new Bank();
        myBank.createAnAccount("henry", "ezenwa");
    }
    @Test
    void Bank_canStoreNewAccountCreated(){
        Bank myBank = new Bank();
        myBank.createAnAccount("henry", "ezenwa");
        assertEquals(1, myBank.getTotalAccounts());
        myBank.createAnAccount("john", "smith");
        assertEquals(2, myBank.getTotalAccounts());
    }

    @Test
    void bank_CanRetrieveAccount(){
        Bank myBank =new Bank();
        myBank.createAnAccount("henry", "ezenwa");
        assertEquals(1, myBank.retrieveAllAccounts().size());
        myBank.createAnAccount("henry", "ezenwa");
        assertEquals(2, myBank.retrieveAllAccounts().size());
    }

    @Test
    void bank_CanGenerateSerialNumber(){
        Bank myBank=new Bank();
        myBank.createAnAccount("henry","ezenwa");
        myBank.createAnAccount("henri","ezenwe");

        ArrayList<BankAccount> accounts = myBank.retrieveAllAccounts();
        assertEquals(1000, accounts.get(0).getAccountNumber());
        assertEquals(1001, accounts.get(1).getAccountNumber());
    }

    @Test
    void bank_CanRetrieveAccountWithAccountNumber(){
        Bank myBank=new Bank();
        myBank.createAnAccount("henry","enzenwe");
        BankAccount account = myBank.retrieveAccountWithNumber(1000);
        assertEquals(1000, account.getAccountNumber());
    }

    @Test
    void bank_CanReturnNullWhenAccountIsNotFound(){
        Bank myBank=new Bank();
        BankAccount account = myBank.retrieveAccountWithNumber(1000);
        assertNull(account);
    }
    @Test
    void user_CanDepositCash_InBankAccount(){
        Bank myBank = new Bank();
        myBank.createAnAccount("henry","enzenwe");
        myBank.deposit(1000, 1000);
        BankAccount account = myBank.retrieveAccountWithNumber(1000);
        assertEquals(1000, account.getAccountBalance());
    }
    @Test
    void user_Cannot_DepositCashWithNegativeAmount(){
        Bank myBank = new Bank();
        myBank.createAnAccount("henry","enzenwe");
        myBank.deposit(-1000, 1000);
        BankAccount account = myBank.retrieveAccountWithNumber(1000);
        assertEquals(0, account.getAccountBalance());
    }

//    @Test
//    void userCanWithdrawCashWithCorrectPin(){
//       Bank  myBankAccount = new Bank();
//       myBankAccount.deposit(2000);
//        myBankAccount.withdraw(1500,2121);
//        assertEquals(500,myBankAccount.getAccountBalance());
//    }
//    @Test
//    void userCannotWithdraw_NegativeValue(){
//        Bank myBankAccount = new Bank ();
//        myBankAccount.deposit(2000);
//        myBankAccount.withdraw(-1000, 2121);
//        assertEquals(2000,myBankAccount.getAccountBalance());
//    }
//    @Test
//    void user_CannotWithdraw_Zero(){
//        Bank myBankAccount = new Bank ();
//        myBankAccount.deposit(2000);
//        myBankAccount.withdraw(0, 2121);
//        assertEquals(2000,myBankAccount.getAccountBalance());
//    }

}

