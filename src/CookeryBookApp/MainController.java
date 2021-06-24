package CookeryBookApp;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        System.out.println("What would you like to do:\n 1. addUser\n 2. login \n 3. addReceipt");
        Scanner input = new Scanner(System.in);
        String choose = input.next();
        if (choose.trim().contains("1")) {
            UserController.addUser(input);
        }
    }
}
