package CookeryBookApp;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        app:
        while (true) {
            System.out.println("What would you like to do:\n 1. addUser\n 2. login \n 3. addReceipt \n 4. exit");
            Scanner input = new Scanner(System.in);
            String choose = input.next().trim();
            switch (choose) {
                case "1":
                    UserController.addUser(input);
                    break;
                case "2":
                    UserController.userLogin(input);
                    break;
                case "3":
                    UserController.addReceipt(input);
                    break;
                case "4":
                    break app;
                default:
                    choose = "1. addUser\n 2. login \n 3. addReceipt\n 4. exit";
                    break;
            }
        }
        System.out.println("\nThank you for using our Cookery Book App.");
        System.exit(0);
    }
}
