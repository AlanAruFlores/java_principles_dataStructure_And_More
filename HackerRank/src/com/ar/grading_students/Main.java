package com.ar.grading_students;
import java.util.*;

public class Main {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> resultsGrades = new ArrayList<>();
        
        grades.forEach(g->{
            
            if(g >= 38){
                int newGrade = ((g/5) + 1) * 5;
                
                if(newGrade - g < 3)
                    g = newGrade;
            }
            resultsGrades.add(g);
        });
        
        return resultsGrades;
    }

}
