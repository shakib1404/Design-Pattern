
public class ThirdPartyYouTubeClass implements ThirdPartyYoutubeLib {

    @Override
    public void listVideos() {
        // Logic to list videos from YouTube
        System.out.println("Listing videos from YouTube.");
    }

    @Override
    public String getVideoInfo(String id) {
        // Logic to get video info from YouTube
        System.out.println("Getting video info for ID: " + id);
        return "Video Info";
    }

    @Override
    public void downloadVideo(String id) {
        // Logic to download video from YouTube
        System.out.println("Downloading video with ID: " + id);
    }
}
