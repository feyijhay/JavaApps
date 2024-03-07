package fireDrillOne;

public class TaskNine {
    public static void main(String[] args) {


        int sum1 = 0;
        int sum2 = 0;
        int square = 0;

        for (int check = 1; check <= 10; check++) {
            if (check % 4 == 0) {

                int multiple = check;

                int product = 0;

                for (int counter = 1; counter <= 5; counter++) {
                    product += multiple;
                    multiple *= check;
                }

                if (check == 4) {
                    sum1 += product;
                } else if (check == 8) {
                    sum2 += product;

                    square = sum1 * sum1;

                    System.out.println(sum1 + sum2);
                }
            }
        }

    }

}



