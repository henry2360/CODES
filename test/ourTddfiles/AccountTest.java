package ourTddfiles;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AccountTest {
    @Test
    public void accountCanBeDeposited() {
        Account myAccount = new Account();
        myAccount.depositMoney(2500.00);
        double balance = myAccount.getAccountBalance();
        assertEquals(2500, balance);
    }

    @Test
    @DisplayName("Money can be deposited twice Test")
    public void accountCanReceiveDepositTest() {
        Account sarahAccount = new Account();
        sarahAccount.depositMoney(2500);
        assertEquals(2500, sarahAccount.getAccountBalance());
    }

    @Test
    public void accountCannotRecieveNegativeDeposit() {
        Account henryAccount = new Account();
        henryAccount.depositMoney(-3000);
        assertEquals(0, henryAccount.getAccountBalance());
    }
    @Test
    public void moneyCanBeWithdrawnFromAccountWithValidpinTest() {
        Account babasolaAccount = new Account();
        babasolaAccount.depositMoney(7000);
        babasolaAccount.setPin(1234);
        babasolaAccount.withdrawMoney(2000, 1234);
//        assert
        assertTrue(babasolaAccount.getAccountBalance()==5000);
       }

@Test
    void moneyCannotBeWithdrawnWithWrongPin(){
    Account babasolaAccount = new Account();
    babasolaAccount.depositMoney(7000);
    babasolaAccount.setPin(1234);
    babasolaAccount.withdrawMoney(2000, 3325);
//        assert
    assertTrue(babasolaAccount.getAccountBalance()==7000);
}

}