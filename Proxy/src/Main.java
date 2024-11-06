public class Main {
    public static void main(String[] args) {
        // Using YouTube API without caching
        ThirdPartyYoutubeLib youtubeService = new ThirdPartyYouTubeClass();
        YouTubeManager manager = new YouTubeManager(youtubeService);

        manager.renderListPanel();
        manager.renderVideoPage("123");
        manager.downloadVideo("123");

        // Using YouTube API with caching
        ThirdPartyYoutubeLib cachedService = new CachedYouTubeClass(youtubeService);
        YouTubeManager cachedManager = new YouTubeManager(cachedService);

        cachedManager.renderListPanel();
        cachedManager.renderVideoPage("123");
        cachedManager.downloadVideo("123");
    }
}
