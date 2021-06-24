package CookeryBookApp;

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
            FileWriter file = new FileWriter("/home/tamaber/IdeaProjects/MatusLearnJava/src/CookeryBookApp/users.txt");
            file.write(user.getFirstName() + " " + user.getSurname() + " " + user.getPassWord());
            file.close();
            System.out.println("User's data successfully recorded");
        } catch (IOException e) {
            System.out.println("An error occurred while recording user data");
            e.printStackTrace();
        }
    }
}
