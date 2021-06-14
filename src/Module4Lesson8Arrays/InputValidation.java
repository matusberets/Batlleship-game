package Module4Lesson8Arrays;

/*
    As of 8.6.2021 Aim to understand usage of Scanner class  build in methods, such a e.g. hasNextInt()
 */

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] mapCoordinates = new char[5][5];
        mapCoordinates[2][2] = '@';

        System.out.print("Enter a 2 ints, range from 0 to 4: ");
        while (true) {
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            if ((number1 > 4) || (number1 < 0) || (number2) > 4 || (number2 < 0)) {
                System.out.println("Incorect numbers ! Enter correct number:");
            }

            else {
                System.out.println("Correct numbers entered: " + number1 + " " + number2);
                break;
            }
        }
        System.out.println("While escaped !");
    }


}

