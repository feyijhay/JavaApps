public class ArrayOfOneAndZeros {

    public int[] changeIndexElement(int... numbers){
        for (int check=0; check < numbers.length; check++){
            numbers[check] = numbers[check]%2;

        }
        return numbers;
    }
}




