package BankApp;

public class InvalidAmountException extends RuntimeException{
        public InvalidAmountException(String statement){
            super(statement);
        }
}
