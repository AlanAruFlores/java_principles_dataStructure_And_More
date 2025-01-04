package com.ar.java_priority_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.*;

/*
There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.

    ENTER: A student with some priority enters the queue to be served.
    SERVED: The student with the highest priority is served (removed) from the queue.

A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):

    The student having the highest Cumulative Grade Point Average (CGPA) is served first.
    Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
    Any students having the same CGPA and name will be served in ascending order of the id.
*/


class Student{
    int id;
    String name;
    double cgpa;
    
    public Student(int id , String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCgpa(){
        return this.cgpa;
    }
    
}

class StudentComparator implements Comparator<Student>{
    
    @Override 
    public int compare (Student studentOne, Student studentTwo){
    	
    	//DESCENDING BY GCPA 
        if(Double.compare(studentTwo.getCgpa(), studentOne.getCgpa()) != 0){
            return Double.compare(studentTwo.getCgpa(), studentOne.getCgpa());
        }
        
        //ASCENDING NAME
        if(studentOne.getName().compareTo(studentTwo.getName()) != 0)
        {
            return studentOne.getName().compareTo(studentTwo.getName());
        }
        
        //ASCENDING ID
        return Integer.compare(studentOne.getId(), studentTwo.getId());
    }
    
}

class Priorities{
    StudentComparator studentComparator = new StudentComparator();
    PriorityQueue<Student> students = new PriorityQueue<Student>(studentComparator);
   /* 
    * OTHER WAY TO MAKE THE PRIORITY
    * 
    * 
    PriorityQueue<Student> students = null; 
    public Priorities(){
        students = new PriorityQueue<Student>( (s1, s2) -> {
        
            int[] res = {
                Double.compare(s2.getCgpa(),s1.getCgpa()),
                s1.getName().compareTo(s2.getName()),
                Integer.compare(s1.getId(), s2.getId())
            };
        
            for (int r : res){if (r != 0){return r;}}
        
            return 0;
            
        });
        
    }
    */
    public List<Student> getStudents(List<String> events){
        
        List<Student> studentsToExit = new ArrayList<Student>();
        
        for(String e : events){
            String[] data =  e.split(" ");
            
            if(data[0].equals("ENTER")){
                students.add( new Student(Integer.parseInt(data[3]), data[1], Double.parseDouble(data[2])));
            }else{
                students.poll();
            }

        }
        
        Student aux = null;
        while((aux = students.poll()) != null){
            studentsToExit.add(aux);
            
        }
        return studentsToExit;
            
    }
    
    
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}