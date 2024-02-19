import java.util.Scanner;
import java.util.ArrayList;

public class ClassWork {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

             ArrayList<Integer> number = new ArrayList<Integer>();

            int userInput = 0;

            while (userInput < 15) {
            System.out.print("Enter num:");
            userInput = input.nextInt();
            number.add(userInput);

                if (userInput >= 15) {
                    System.out.println("Invalid number! Please enter number from 1 - 15:");
                    System.out.print("Enter num:");
                    userInput = input.nextInt();
                    number.add(userInput);


                    while (userInput == 22) {
                        break;


                     }
                }
            }

            for(int check = 0; check < number.size(); check++){
                for(int check1 =0; check1 < number.get(check); check1++){

                }
                System.out.print("*");
            }
            System.out.println();
    }

}
