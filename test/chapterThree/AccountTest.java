package chapterThree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {

    @Test
    public void depositNegativeBalance_balanceRemainsUnchangedTest() {
        Account jumokeAccount = new Account();
        assertEquals(0, jumokeAccount.getBalance());

        jumokeAccount.deposit(-50_000);
        assertEquals(0, jumokeAccount.getBalance());
    }

        @Test
    public void depositPositiveAccount_balanceIncreasesTest(){
            Account jumokeAccount = new Account();
            assertEquals(0, jumokeAccount.getBalance());

            jumokeAccount.deposit(2_000);
            assertEquals(2_000, jumokeAccount.getBalance());
        }

    @Test
    public void depositPositiveAccountTwice_balanceIncreasesTest(){
        Account jumokeAccount = new Account();
        assertEquals(0, jumokeAccount.getBalance());

        jumokeAccount.deposit(2_000);
        jumokeAccount.deposit(4_000);
        assertEquals(6_000, jumokeAccount.getBalance());
    }

    @Test
    public void depositPositiveAccountThird_balanceIncreasesTest(){
        Account jumokeAccount = new Account();
        assertEquals( 0, jumokeAccount.getBalance());


        jumokeAccount.deposit(-50_000);
        assertEquals(0, jumokeAccount.getBalance());
    }


    }




