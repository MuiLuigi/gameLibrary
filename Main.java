import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VideoGameDirectory library = new VideoGameDirectory();

        boolean isActive = true;

        while (isActive) {
            System.out.println("\nHi there, let's manage your games");
            System.out.println("1. Add a new game");
            System.out.println("2. View library");
            System.out.println("3. Delete a game");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.print("What's the name of the game? ");
                    String gameName = scanner.nextLine();

                    System.out.print("Game genre: ");
                    String genre = scanner.nextLine();

                    System.out.print("Console/platform: ");
                    String console = scanner.nextLine();

                    library.addNewGame(new VideoGames(gameName, genre, console));
                    break;

                case 2:
                    library.viewDirectory();
                    break;

                case 3:
                    System.out.print("What game number should I remove? ");
                    int index = Integer.parseInt(scanner.nextLine()) - 1;
                    library.deleteVideoGame(index);
                    break;

                case 4:
                    isActive = false;
                    System.out.println("See you next time!");
                    break;

                default:
                    System.out.println("Try again, pick from the list.");
            }
        }

        scanner.close();
    }
}
