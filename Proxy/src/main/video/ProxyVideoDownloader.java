package main.video;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader {
    private final Map<String, Video> cachedVideos = new HashMap<>();;
    private final VideoDownloader downloader = new RealVideoDownloader();

    @Override
    public Video getVideo(String videoName) {
        if (!cachedVideos.containsKey(videoName)) {
            cachedVideos.put(videoName, downloader.getVideo(videoName));
        }

        return cachedVideos.get(videoName);
    }
}
