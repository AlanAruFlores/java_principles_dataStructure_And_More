package com.ar.proxy;

import java.util.HashMap;


/*
 * Objeto original donde se consultaran los datos originales
 * */
public class ThirdPartyYoutubLibImpl implements ThirdPartyYoutubLib{

	@Override
	public HashMap<String, Video> tenerVideosPopulares() {
		conectarServer("http://www.youtube.com");
		return tenerVideosRandom();
	}

	@Override
	public Video tenerVideo(String videoId) {
		conectarServer("http://www.youtube.com/"+videoId);
		return obtenerAlgunVideo(videoId);
	}
	
	
	
	//Metodos de simulacion
	
	private void conectarServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        latenciaExperiencia();
        System.out.print("Connected!" + "\n");
	}
	
	private int obtenerRandom(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));	
    }
	
	private void latenciaExperiencia() {
		int randomLatencia = obtenerRandom(1, 10);
		
		for(int i = 0 ; i < randomLatencia; i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private HashMap<String, Video> tenerVideosRandom(){
		System.out.print("Downloading populars... ");

		latenciaExperiencia();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));
        
        return hmap;
	}
	
	private Video obtenerAlgunVideo(String videoId) {
		  System.out.print("Downloading video... ");

		latenciaExperiencia();
        Video video = new Video(videoId, "Some video title");

        System.out.print("Done!" + "\n");
        return video;
	}
	
	

}
