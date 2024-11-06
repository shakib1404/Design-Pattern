
import java.util.HashMap;
import java.util.Map;

public class CachedYouTubeClass implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeLib service;
    private Map<String, String> cacheVideoInfo = new HashMap<>();
    private Map<String, String> cacheListVideos = new HashMap<>();

    public CachedYouTubeClass(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    @Override
    public void listVideos() {
        if (cacheListVideos.isEmpty()) {
            System.out.println("Fetching video list from YouTube service...");
            service.listVideos();
            // Assume cache logic fills cacheListVideos after fetching.
            cacheListVideos.put("videos", "Sample video list");
        } else {
            System.out.println("Returning cached video list.");
            System.out.println(cacheListVideos.get("videos"));
        }
    }

    @Override
    public String getVideoInfo(String id) {
        if (!cacheVideoInfo.containsKey(id)) {
            System.out.println("Fetching video info from YouTube service for ID: " + id);
            String info = service.getVideoInfo(id);
            cacheVideoInfo.put(id, info);
            return info;
        } else {
            System.out.println("Returning cached video info for ID: " + id);
            return cacheVideoInfo.get(id);
        }
    }

    @Override
    public void downloadVideo(String id) {
        if (!cacheVideoInfo.containsKey(id)) {
            System.out.println("Downloading video through YouTube service for ID: " + id);
            service.downloadVideo(id);
        } else {
            System.out.println("Video with ID: " + id + " is already downloaded and cached.");
        }
    }
}
