package com.ar.proxy;

/**
 * Proxy:
 * 
 * Proxy es un patrón de diseño estructural que te permite proporcionar un sustituto o marcador
 *  de posición para otro objeto. Un proxy controla el acceso al objeto original,
 *  permitiéndote hacer algo antes o después de que la solicitud llegue al objeto original.
 */
public class Main {
	
    public static void main(String[] args) {
    	
    	//Descargador hacia el objeto original
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubLibImpl());
       
        //Descargador hacia el objeto proxy
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        
        //Tiempo en el que se ahorro el proxy en (ms)
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }

}
