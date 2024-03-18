public class Main {
    public static void main(String[] args) {
        Playable musicPlayer = new MusicPlayer();
        Playable videoPlayer = new VideoPlayer();

        MediaController controller = new MediaController();

        controller.playMedia(musicPlayer);
        controller.playMedia(videoPlayer);
    }
}
