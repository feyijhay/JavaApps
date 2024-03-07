package fireDrillOne;

public class TaskSeven {
    public static void main(String[] args) {

        int sum1 = 0;

        int sum2 = 0;

        for (int count = 1; count <= 10; count++) {
            if (count % 4 == 0) {

                int multiple = count;

                int product = 0;

                for (int counter = 1; counter <= 5; counter++) {
                    product += multiple;
                    multiple *= count;
                }
                if (count == 4) {
                    sum1 += product;
                }
                else if (count == 8) {
                    sum2 += product;

                    System.out.printf("%d%n%d", sum1, sum2);
                }
            }
        }




            }
        }

