
import java.util.HashMap;
import java.util.Map;

public class VideoDownloaderProxy implements VideoDownloader {
    private YouTubeVideoDownloader youtubeDownloader;
    private Map<String, String> videoInfoCache = new HashMap<>();
    private Map<String, Boolean> downloadCache = new HashMap<>();

    public VideoDownloaderProxy() {
        this.youtubeDownloader = new YouTubeVideoDownloader();
    }

    @Override
    public String getVideoInfo(String videoId) {
        if (!videoInfoCache.containsKey(videoId)) {
            System.out.println("Video info not found in cache. Fetching from YouTube...");
            String info = youtubeDownloader.getVideoInfo(videoId);
            videoInfoCache.put(videoId, info);
            return info;
        } else {
            System.out.println("Returning cached video info for ID: " + videoId);
            return videoInfoCache.get(videoId);
        }
    }

    @Override
    public void downloadVideo(String videoId) {
        if (!downloadCache.containsKey(videoId)) {
            System.out.println("Video not downloaded yet. Downloading now...");
            youtubeDownloader.downloadVideo(videoId);
            downloadCache.put(videoId, true);
        } else {
            System.out.println("Video with ID: " + videoId + " is already downloaded. No need to download again.");
        }
    }
}
