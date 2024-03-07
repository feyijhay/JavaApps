package fireDrillTwo;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


int numbers = 0;
int result = 0;

        for (int check = 1; check <= 10; check++) {
            System.out.print("Enter number:");
             numbers = input.nextInt();

            if (check % 2 == 0) {
                result+=numbers;
            }
        }
        System.out.printf("%d", result);

    }
}