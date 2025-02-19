package com.ar.angry_profesor;
import java.util.*;

public class Main {
	
    /*
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
        int countStudentsAttendance = (int)a.stream().filter(s -> s <= 0).count();
        
        return countStudentsAttendance >= k ? "NO" : "YES";
    }
    
}
