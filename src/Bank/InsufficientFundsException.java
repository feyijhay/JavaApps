package Bank;

public class InsufficientFundsException extends RuntimeException{
        public InsufficientFundsException(String statement){
            super(statement);
        }

}
