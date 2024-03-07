package fireDrillTwo;
import java.util.Arrays;

public class LengthOfArray {
    public static void main(String[] args) {
        LengthOfArray length = new LengthOfArray();
        int[] number = {4, 5, 8};
        int[] number2 = {0, 0, 0};
        int[] result = length.numbers(number, number2);
        System.out.println(Arrays.toString(result));
    }
        public int []  numbers(int[] num, int[] num2){
            int[] numm = new int[num.length + num.length];
            int count = 0;

            for (int check = 0; check < num.length; check++) {
                numm[count] = num[check];
                count++;


            }
            return  numm;

        }

}


