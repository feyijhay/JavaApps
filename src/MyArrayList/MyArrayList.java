package MyArrayList;

public class MyArrayList {
    private boolean isEmpty = true;
    private int[] array = new int[3];
    private int numbers;


    public boolean isEmpty() {
        return isEmpty;
    }

    public void add(int number){
        array[numbers] = number;
        numbers++;

        isEmpty = false;

    }

    public void remove(int number) {
    }

    public int get(int number) {
        return array[number];
    }

    public int size() {
        return numbers;
    }


}






