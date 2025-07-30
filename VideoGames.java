public class VideoGames {
    private String videoGameTitle;
    private String videoGameGenre;
    private String videoGamePlatform;

    //This is the constructor method
    public VideoGames (String videoGameTitle, String videoGameGenre, String videoGamePlatform) {
        this.videoGameTitle = videoGameTitle;
        this.videoGameGenre = videoGameGenre;
        this.videoGamePlatform = videoGamePlatform;
    }

    //These are the getter methods
    public String getVideoGameTitle() {
        return videoGameTitle;
    }

    public String getVideoGameGenre() {
        return videoGameGenre;
    }

    public String getVideoGamePlatform() {
        return videoGamePlatform;
    }

    //This is for showing the video game's information
    @Override
    public String toString() {
        return "The title is: " + videoGameTitle + ". The genre of the video game is: " + videoGameGenre + ". The video game's platform is: " + videoGamePlatform;
    }
}