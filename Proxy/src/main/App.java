package main;

import main.internet.Internet;
import main.internet.ProxyInternet;
import main.video.ProxyVideoDownloader;
import main.video.VideoDownloader;

public class App {
    public static void main(String[] args) throws Exception {
        Internet internet = new ProxyInternet();
        internet.connectTo("geeksforgeeks.org");
        internet.connectTo("banned.com");

        System.out.println("==========================================");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("geekific");
    }
}
