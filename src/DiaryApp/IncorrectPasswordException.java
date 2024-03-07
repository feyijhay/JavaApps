package DiaryApp;

public class IncorrectPasswordException extends RuntimeException{
    public IncorrectPasswordException(String statement){
        super(statement);
    }
}
