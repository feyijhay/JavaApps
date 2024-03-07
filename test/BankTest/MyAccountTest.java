package BankTest;

import Bank.MyAccount;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class MyAccountTest {
    @Test
    public void thatAccountIsEmpty(){
        MyAccount myAccount = new MyAccount();
        assertEquals(0, myAccount.checkBalance("correct pin"));

    }

    @Test
    public void testthatAccountCanDeposit2000(){
        MyAccount myAccount = new MyAccount();
        assertEquals(0, myAccount.checkBalance("correct pin"));
        myAccount.deposit(2_000);
        assertEquals(2_000, myAccount.checkBalance("correct pin"));
    }


    @Test
    public void testthatAccountCanDeposit10000_Withdraw5000_BalanceRemains5000(){
        MyAccount myAccount = new MyAccount();
        assertEquals(0, myAccount.checkBalance("correct pin"));
        myAccount.deposit(10_000);
        myAccount.withdraw(5_000);
        assertEquals(5_000, myAccount.checkBalance("correct pin"));
    }

    @Test
    public void testthatAccountCanDeposit5000_Withdraw5000_BalanceRemains0(){
        MyAccount myAccount = new MyAccount();
        assertEquals(0, myAccount.checkBalance("correct pin"));
        myAccount.deposit(5_000);
        myAccount.withdraw(5_000);
        assertEquals(0, myAccount.checkBalance("correct pin"));
    }

    @Test
    public void testthatAccountCanDepositTwice_BalanceIncreases(){
        MyAccount myAccount = new MyAccount();
        assertEquals(0, myAccount.checkBalance("correct pin"));
        myAccount.deposit(4_000);
        myAccount.deposit(5_000);
        assertEquals(9_000, myAccount.checkBalance("correct pin"));
    }

    @Test
    public void testthatAccountCanDepositNegativeAmount_BalanceDoesNotChange(){
        MyAccount myAccount = new MyAccount();
        assertEquals(0, myAccount.checkBalance("correct pin"));
        myAccount.deposit(-4_000);
        assertEquals(0, myAccount.checkBalance("correct pin"));
    }


}
