package fireDrillOne;

import java.sql.SQLOutput;

public class TaskFive {
    public static void main(String[] args) {

        for (int check = 1; check <= 10; check++) {
            if (check % 4 == 0) {
                System.out.printf("%d%d%d%d%d", check,check,check,check,check);

            }

        }
    }
}