public class MyStack{
    private boolean isEmpty = true;
    private int[] stack;
    private int element;

    public MyStack(int stackLength){
        stack = new int[stackLength];
    }
    public boolean isEmpty() {
        return isEmpty;
    }
    public void push(int element){
        this.element = element;
        isEmpty = !isEmpty;
    }
}