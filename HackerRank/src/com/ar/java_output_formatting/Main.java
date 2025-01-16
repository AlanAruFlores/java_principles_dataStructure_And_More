package com.ar.java_output_formatting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                s1 = getStringFormat(s1);
                int x=sc.nextInt();
                //Complete this line
                String xtext = (x>=100) ? ""+x : 
                    (x>=10)? "0"+x : "00"+x;
                
                System.out.println(s1+""+xtext);                
                
            }
            System.out.println("================================");

    }
    
    public static String getStringFormat(String s){
        String[] arr = s.split("");
        String sFormat="";
        for(int i = 0; i < 15; i++){
            if(arr.length>i)
                sFormat += arr[i]; 
            else
                sFormat += " "; 
        }
        return sFormat;
    }
}
