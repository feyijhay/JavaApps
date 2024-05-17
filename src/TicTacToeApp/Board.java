package TicTacToeApp;

    public enum Board{

       EMPTY("EMPTY"),
        X("X"),
        O("O");

       private String value;

       public String getValue(){
           return value;
       }
       Board(String value){
           this.value = value;
       }

       public String toString(){
           return getValue();
       }


    }

