package com.ar.java_date_and_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        
        Calendar calendar = Calendar.getInstance();  
        
        //Note: The month init with 0 (January)  
        calendar.set(year, month-1, day);
        
        //Format to get the name of the day
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");

        // Get the name of the day (e.g., Monday, Tuesday, etc.)
        String dayOfWeek = dayFormat.format(calendar.getTime());
        
        return dayOfWeek.toUpperCase();    
    }

}

public class Main {
	public static void main(String[] args) {
		
	}
}
