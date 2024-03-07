package DoubleArray;

public class DoubleArray {

    public int[] array(int[] number){
        int[] num = new int[number.length * 2];
        return num;

    }

    public int[] doubleArray(int[] number) {
        int count = 0;
        int count2 = 0;
        int[] array = new int[number.length * 2];
        for (int i = 0; i < number.length; i++) {
            array[count] = number[i];
            count++;
        }

        for(int check = number.length; check < array.length; check++){
            array[check] = number[count2] * 2;
            count2++;

        }
        return array;
    }
}
