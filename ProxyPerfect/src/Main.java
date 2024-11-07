public class Main {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new VideoDownloaderProxy();

        // First call - will fetch from YouTube and cache the info
        videoDownloader.getVideoInfo("abc123");
        
        // Second call - will return cached info
        videoDownloader.getVideoInfo("abc123");

        // First call - downloads the video
        videoDownloader.downloadVideo("abc123");

        // Second call - detects already downloaded
        videoDownloader.downloadVideo("abc123");

        // Another video, uncached initially
        videoDownloader.getVideoInfo("xyz789");
    }
}
