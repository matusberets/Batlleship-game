package Module4Lesson8Arrays;

/*
  31.5.2021 module 4 lesson 8, searching in array.
 */

import java.util.Scanner;

public class AveragerString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What word do you want to search for ? ");
        String searchedWord = input.next().toLowerCase();
        System.out.printf("Searched word \"%s\" was %s", searchedWord, searchStringArray(searchedWord, elementsArrayCreation(5)));
    }

    public static String searchStringArray(String searchedWord, String[] source) {
        String result = "not found";
        for (String concept : source) {
            if (concept.equals(searchedWord)) {
                result = "found";
                break;
            }
        }
        return result;
    }

    //create a method for arrayElementsCreation
    public static String[] elementsArrayCreation(int elementsCount) {
        System.out.print("How big elements array should I create ?\n[enter positive integer number]: ");
        Scanner input = new Scanner(System.in);

        String[] elementsArray = new String[input.nextInt()];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter element no.%d:", i);
            elementsArray[i] = input.next();
        }
        return elementsArray;
    }
}