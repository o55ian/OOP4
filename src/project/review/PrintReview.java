package project.review;

import java.util.Scanner;

public class PrintReview {
    public PrintReview() {
    }

    public void printReview() {
        int ID = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the ID of the review");
        int InputID = scanner.nextInt();
        if (InputID == ID) {
            System.out.println("\"Grade: <grade>.<written comment>\"");
        } else {
            int WrongIDErrorMessage1 = 1;
            int WrongIDErrorMessage2 = 2;
            int WrongIDErrorMessage3 = 3;
            switch (WrongIDErrorMessage1 | WrongIDErrorMessage2 | WrongIDErrorMessage3) {
                case 1:
                    System.out.println("Item <ID> was not registered yet.");
                    break;
                case 2:
                    System.out.println("Item <item name> has not been reviewed yet.");
                    break;
                case 3:
                    System.out.println("Invalid review number. Choose between 1 and <num of item reviews>.");
            }
        }

    }
}