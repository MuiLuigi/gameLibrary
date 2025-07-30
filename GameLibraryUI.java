import java.util.Scanner;

public class GameLibraryUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Video Game Library! ");
            System.out.println("Please select one of the following options:");
            System.out.println("1. Add a new game");
            System.out.println("2. View library");
            System.out.println("3. Delete a game");
            System.out.println("4. Search for a game");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add Game");
                    break;
                case 2:
                    System.out.println("View Library");
                    break;
                case 3:
                    System.out.println("Delete Game");
                    break;
                case 4:
                    System.out.println("Search Game");
                    break;
                case 5:
                    System.out.println("Thank you for using the Video Game Library. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

            System.out.println(); // spacing
        }

        scanner.close();
    }
}
