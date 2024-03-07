package fireDrillTwo;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

            int average = 0;
            int numbers = 0;
            int sum = 0;

            for (int check = 1; check <= 10; check++) {
                System.out.print("Enter number:");
                numbers = input.nextInt();

                sum+=numbers;

                average = sum / check;






            }
        System.out.printf("The average is:%d", average);


    }



}






