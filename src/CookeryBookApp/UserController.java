package CookeryBookApp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class UserController {
    // build a logic to get users name, surname, and a password
    public static void addUser(Scanner scanner) {
        User user = new User();
        String input = "";
        while (input.trim().isEmpty()) {
            System.out.printf("Enter your first name: ");
            input = scanner.next();
            if (!input.trim().isEmpty()) {
                user.setFirstName(input);
            }
            System.out.printf("Enter your surname: ");
            input = scanner.next();
            if (!input.trim().isEmpty()) {
                user.setSurname(input);
            }
            System.out.printf("Enter your secret password: ");
            input = scanner.next();
            if (!input.trim().isEmpty()) {
                user.setPassWord(input);
            }
        }
        try {
            File fileReader = new File("/home/tamaber/IdeaProjects/MatusLearnJava/src/CookeryBookApp/users.txt");
            Scanner inputScanner = new Scanner(fileReader);
            String headerFile = "";
            if (inputScanner.hasNext()) {
                headerFile = inputScanner.next();
            }
            String header = "FirstName Surname Password";

            FileWriter file = new FileWriter("/home/tamaber/IdeaProjects/MatusLearnJava/src/CookeryBookApp/users.txt", true);
            BufferedWriter bw = new BufferedWriter(file);
            // create a header if it does not exist
            if (headerFile.isEmpty()) {
                bw.write(header);
                bw.newLine();
            }
            bw.write(user.getFirstName() + " " + user.getSurname() + " " + user.getPassWord());
            bw.newLine();
            bw.close();
            System.out.println("\nUser's data successfully recorded\n");
        } catch (IOException e) {
            System.out.println("An error occurred while recording user data");
            e.printStackTrace();
        }
    }
    public static void userLogin(Scanner input) {
        System.out.println("Time to develop this method is coming soon ! :)\nCome back tomorrow, you might find a progress\n");
    }
    public static void addReceipt(Scanner input) {
        System.out.println("Time to develop this method is coming soon ! :)\nCome back tomorrow, you might find a progress\n");
    }
}

