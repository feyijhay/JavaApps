package fireDrillTwo;
import java.util.Scanner;


public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


int sum = 0;

for(int check = 1; check<=10; check++){
    System.out.print("Enter number:");
    int numbers = input.nextInt();
    sum += numbers;

}
        System.out.printf("%d", sum);
    }

}


