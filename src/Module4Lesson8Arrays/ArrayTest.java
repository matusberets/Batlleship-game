package Module4Lesson8Arrays;

/*
10.06.2021 write a program to take an input from an user  a sequence of numbers and then
 fill an array with these numbers  and the ask for searching one of these
*/

import learn2code.Car;

import java.util.*;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar(2021, 01, 1);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        System.out.println("\n=======================================================================");
        System.out.printf("Today is: %d-%d-%d.", day, month,year);
        System.out.printf("\nDear user, this program allows you to enter a desired number of digits,\nstore these in an array and then search for occurance of a given number\nin a created array\n");
        System.out.println("=======================================================================\n");
        Scanner input = new Scanner(System.in);

        System.out.printf("How many numbers do you wish to enter ? ");
        int arraySize = input.nextInt();

        System.out.printf("Enter these numbers: ");

        int[] intArray = new int[arraySize];
        int numberInput;
        int counter = 0;

        while (input.hasNextInt()) {
            numberInput = input.nextInt();
            intArray[counter] = numberInput;
            counter++;
            if (arraySize == counter) break;
        }

        System.out.printf("Check if number exist in an array, type a num.: ");
        int checkInt = input.nextInt();
        System.out.println(searchArrayInt(intArray, checkInt));

        String answer;
        do {
            System.out.printf("Do you want to search again [Y/N] ? ");
            answer = input.next();

            if (answer.toLowerCase().contains("n")) {
                System.out.println("\nThank you for using our service !\nYou are welcome to come back again.");
                break;
            }

            System.out.printf("Enter a number to search: ");
            checkInt = input.nextInt();
            System.out.println(searchArrayInt(intArray, checkInt));
        } while (answer.toLowerCase().contains("y"));

        System.out.println("\n================================");
        System.out.println("PROGRAM SUCCESFULLY TERMINATED !");
    }

    public static String searchArrayInt (int[] arrayInt, int searchedInt) {
        String result = "Number not found";
        for (int element : arrayInt) {
            if (searchedInt == element) {
                result = "Number found !";
                break;
            }
        }
        return result;
    }
}
