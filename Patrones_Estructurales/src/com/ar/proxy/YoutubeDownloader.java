package com.ar.proxy;

import java.util.HashMap;

public class YoutubeDownloader {
	private ThirdPartyYoutubLib api;
	
	
	public YoutubeDownloader (ThirdPartyYoutubLib api) {
		this.api = api;
	}
	

    public void renderVideoPage(String videoId) {
        Video video = api.tenerVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.titulo);
        System.out.println("Video: " + video.dato);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.tenerVideosPopulares();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.titulo);
        }
        System.out.println("-------------------------------\n");
    }
	
	
}
