package chapterThree;

public class Account {
    private int balance;
    public int getBalance() {

        return balance;
    }
    public void deposit(int amount){
        if(amount > 0) balance += amount;
    }

    public void balance(int amount){
        if (amount < 0) balance -= amount;

    }



}

