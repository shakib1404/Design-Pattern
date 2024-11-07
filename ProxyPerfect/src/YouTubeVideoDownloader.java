public class YouTubeVideoDownloader implements VideoDownloader {

    @Override
    public String getVideoInfo(String videoId) {
        // Simulating an API call to get video info
        System.out.println("Fetching video info from YouTube for ID: " + videoId);
        return "Video info for ID: " + videoId;
    }

    @Override
    public void downloadVideo(String videoId) {
        // Simulating a video download operation
        System.out.println("Downloading video from YouTube with ID: " + videoId);
    }
}
