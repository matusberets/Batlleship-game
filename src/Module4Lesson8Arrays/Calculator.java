package Module4Lesson8Arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation:");
        Scanner input = new Scanner(System.in);
        String userOpInput = input.next().toLowerCase();

        switch (userOpInput) {
            case "add":
                System.out.println("Enter two integers:");
                int numberAdd1, numberAdd2;
                if (input.hasNextInt()) {
                    numberAdd1 = input.nextInt();
                    if (input.hasNextInt()) {
                        numberAdd2 = input.nextInt();
                    }
                    else {
                        System.out.println("Invalid input entered. Terminating...");
                        break;
                    }
                }
                else {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                int result = numberAdd1 + numberAdd2;
                System.out.println("Answer: " + result);
                break;


            case "subtract":
                System.out.println("Enter two integers:");
                int numberSubtract1, numberSubtract2;
                if (input.hasNextInt()) {
                    numberSubtract1 = input.nextInt();
                    if (input.hasNextInt()) {
                        numberSubtract2 = input.nextInt();
                    }
                    else {
                        System.out.println("Invalid input entered. Terminating...");
                        break;
                    }
                }
                else {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                int resultSubtract = numberSubtract1 - numberSubtract2;
                System.out.println("Answer: " + resultSubtract);
                break;


            case "multiply":
                System.out.println("Enter two doubles:");
                boolean checkDoubleMultiply1 = input.hasNextDouble();
                boolean checkDoubleMultiply2 = input.hasNextDouble();
                if (checkDoubleMultiply1 || checkDoubleMultiply2) {
                    double numberDouble1 = input.nextDouble();
                    double numberDouble2 = input.nextDouble();
                    double resultMultiply = numberDouble1 * numberDouble2;
                    System.out.printf("Answer: %.2f\n", resultMultiply);
                    break;
                }
                System.out.println("Invalid input entered. Terminating...");
                break;


            case "divide":
                System.out.println("Enter two doubles:");
                double numberDivide1;
                double numberDivide2;
                if (input.hasNextDouble()) {
                    numberDivide1 = input.nextDouble();
                    if (input.hasNextDouble()) {
                        numberDivide2 = input.nextDouble();
                    }
                    else {
                        System.out.println("Invalid input entered. Terminating...");
                        break;
                    }
                }
                else {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                if ((numberDivide1 == 0.0) || (numberDivide2 == 0.0)) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                double resultDivide = numberDivide1 / numberDivide2;
                System.out.printf("Answer: %.2f\n", resultDivide);
                break;


            case "alphabetize":
                System.out.println("Enter two words:");
                boolean stringIntCheck1 = input.hasNextInt();
                boolean stringIntCheck2 = input.hasNextInt();
                boolean stringFloatCheck1 = input.hasNextFloat();
                boolean stringFloatCheck2 = input.hasNextFloat();
                boolean stringDoubleCheck1 = input.hasNextDouble();
                boolean stringDoubleCheck2 = input.hasNextDouble();
                if (!stringIntCheck1 || !stringIntCheck2 || !stringFloatCheck1 || !stringFloatCheck2 || !stringDoubleCheck1 || !stringDoubleCheck2) {
                    String string1 = input.next();
                    String string2 = input.next();

                    if (string1.compareTo(string2) < 0) {
                        System.out.printf("Answer: %s comes before %s alphabetically.\n", string1, string2);
                        break;
                    } else if (string1.equals(string2)) {
                        System.out.println("Answer: Chicken or Egg.");
                        break;
                    } else {
                        System.out.printf("Answer: %s comes before %s alphabetically.\n", string2, string1);
                        break;
                    }
                }
                System.out.println("Invalid input entered. Terminating...");
                break;

            default:
                System.out.println("Invalid input entered. Terminating...");
                break;
        }
    }
}
