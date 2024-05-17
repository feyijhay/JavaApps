package BankApp;

public class MyAccount {
    private int balance;
    public int checkBalance(String correctPin) {
        return balance;
    }

    public void deposit(int amount) {
        if(amount>0) balance+=amount;
    }

    public void withdraw(int amount) {
        balance-=amount;
    }
}
