import java.util.ArrayList;

public class VideoGameDirectory {
    private ArrayList<VideoGames> directory;

    //This is the constructor method
    public VideoGameDirectory() {
        directory = new ArrayList<>();
    }

    //This is for adding a new game to the directory
    public void addNewGame(VideoGames newGame) {
        directory.add(newGame);
    }

    //This is for viewing all the video games in the directory
    public void viewDirectory() {
        if(directory.isEmpty()) {
            System.out.println("The directory is currently empty.");
        }
        else {
            for (int i = 0; i < directory.size(); i=i+1) {
                System.out.println((i + 1) + " " + directory.get(i));
            }
        }
    }

    //This is for deleting a video game from the directory. It will be based on the game's index
    public void deleteVideoGame(int videoGameIndex) {
        if(videoGameIndex >= 0 && videoGameIndex < directory.size()) {
            directory.remove(videoGameIndex);
            System.out.println("The video game has been deleted from the directory.");
        }
        else {
            System.out.println("The index is invalid.");
        }
    }

    //This is for searching a video game from the directory based on the game's platform
    public void platformSearch(String gamePlatform) {
        boolean gameFound = false;
        for (VideoGames newGame : directory) {
            if (newGame.getVideoGamePlatform().equalsIgnoreCase(gamePlatform)) {
                System.out.println(newGame);
                gameFound = true;
            }
        }
        if (!gameFound){
            System.out.println("There is no game in the platform: " + gamePlatform + ".");
        }
    }

    public void genreSearch(String gameGenre) {
        boolean gameFound = false;
        for (VideoGames newGame : directory) {
            if (newGame.getVideoGameGenre().equalsIgnoreCase(gameGenre)) {
                System.out.println(newGame);
                gameFound = true;
            }
        }
        if (!gameFound){
            System.out.println("There is no game in the genre: " + gameGenre + ".");
        }
    }
}