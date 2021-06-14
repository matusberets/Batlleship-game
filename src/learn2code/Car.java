package learn2code;

/*
11.6.2021 testing a Car class and its instances possibilities.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {
    static int carInstancesCount = 0;
    static String brand;
    String engineType;
    int engineSize;
    String colour;
    int doorsCount;

    public Car() {
        carInstancesCount++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) { this.brand = brand; }

    public static void main(String[] args) {
        System.out.println("This program saves a new cars entry into company String array datastructure.");
        System.out.println("-----------------------------------------------------------------------");

        System.out.printf("\nHow many new entries do you want to insert ? ");
        Scanner input = new Scanner(System.in);
        int newCarsEntryAmount = input.nextInt();
        String[] newCarsName = new String[newCarsEntryAmount];

        for (int i = 0; i < newCarsName.length; i++) {
            System.out.printf("Enter a cars no.%d brand name: ", (i + 1));
            String tempCarName = input.next();
            newCarsName[i] = tempCarName;
        }
        System.out.println("Cars object total created count = " + carInstancesCount);
        System.out.println("");

        for (String car : newCarsName) {
            System.out.println("Car name is: " + car);
        }
    }
}
