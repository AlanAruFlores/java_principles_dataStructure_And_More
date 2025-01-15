package com.ar.time_conversion;

public class Main {
	public static String timeConversion(String s) {
	    // Write your code here
	        String[] partsTime = s.split(":");
	        
	        
	        
	        if(s.contains("PM") && !partsTime[0].contains("12")){
	            Integer hour = Integer.parseInt(partsTime[0]);
	            hour += 12;
	            partsTime[0] = hour.toString();
	        }else{
	            if(partsTime[0].contains("12") && s.contains("AM"))
	                partsTime[0] = "00"; 
	        }
	        
	        partsTime[2] = partsTime[2].substring(0, 2);
	        
	        
	    
	        return String.join(":", partsTime);
	    }

}
