
public class YouTubeManager {
    private ThirdPartyYoutubeLib youtubeService;

    public YouTubeManager(ThirdPartyYoutubeLib youtubeService) {
        this.youtubeService = youtubeService;
    }

    public void renderVideoPage(String videoId) {
        String info = youtubeService.getVideoInfo(videoId);
        System.out.println("Rendering video page for: " + info);
    }

    public void renderListPanel() {
        youtubeService.listVideos();
    }

    public void downloadVideo(String videoId) {
        youtubeService.downloadVideo(videoId);
    }
}

