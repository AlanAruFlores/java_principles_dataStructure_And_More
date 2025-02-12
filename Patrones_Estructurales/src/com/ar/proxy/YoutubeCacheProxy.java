package com.ar.proxy;

import java.util.HashMap;

public class YoutubeCacheProxy implements ThirdPartyYoutubLib{

	private HashMap<String, Video> cacheTodos = new HashMap<String, Video>();
	private HashMap<String, Video> cachePopulares = new HashMap<String, Video>();
	
	private ThirdPartyYoutubLib youtubeService;
	
	public YoutubeCacheProxy() {
		this.youtubeService = new ThirdPartyYoutubLibImpl();
	}
	
	
	@Override
	public HashMap<String, Video> tenerVideosPopulares() {
		if(cachePopulares.isEmpty()) {
			cachePopulares = this.youtubeService.tenerVideosPopulares();
		}else {
            System.out.println("Retrieved list from cache.");
        }
		
		return this.cachePopulares;
	}

	@Override
	public Video tenerVideo(String videoId) {
		Video video = cacheTodos.get(videoId);
		
		if(video == null) {
			video =this.youtubeService.tenerVideo(videoId);
			cacheTodos.put(videoId, video);
		}else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
		
		return video;
	}
	
    public void reset() {
        cachePopulares.clear();
        cacheTodos.clear();
    }

}
