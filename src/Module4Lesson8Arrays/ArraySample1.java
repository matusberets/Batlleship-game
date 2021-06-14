package Module4Lesson8Arrays;
/*
 * 31.05.2021 / 18:40
 * Finally after more than a week of being stucked with my JAVA journey, I am training and learning again in my new workplace Medzihradne.
 * Module4 , lesson 8, array
 *
 * Program below asks user to enter a number of days to keep a record of a each day temperature.
 * On the end program calculates average temperature.
 */

import java.util.Scanner;

public class ArraySample1 {
    public static void main(String[] args) {
        //TODO ASK FOR AN INPUT TEMPERATURE VALUES
        System.out.print("How many days to store temperature values ? ");
        Scanner input = new Scanner(System.in);
        int daysCount = input.nextInt();

        //TODO save each temperature value in an array
        double[] weekHighs = new double[daysCount];
        double highSum = 0;
        for (int i = 0; i < weekHighs.length; i++) {
            System.out.print("Enter the temperature: ");
            weekHighs[i] = input.nextDouble();
            highSum += weekHighs[i];
        }

        double averageTemp = highSum / weekHighs.length;
        System.out.println("Average temperature is " + averageTemp);

        for (double weekHigh : weekHighs) {
            System.out.println("" + weekHigh);
        }
    }
}
