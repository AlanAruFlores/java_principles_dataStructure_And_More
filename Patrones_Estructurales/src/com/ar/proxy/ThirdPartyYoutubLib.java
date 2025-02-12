package com.ar.proxy;

import java.util.HashMap;

public interface ThirdPartyYoutubLib {
	HashMap<String, Video> tenerVideosPopulares();
	Video tenerVideo(String videoId);
}
