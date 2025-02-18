package com.ar.cat_mouse;

public class Main {
    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        String result = "";
        
        int catADistance = Math.abs(x-z);
        int catBDistance = Math.abs(y-z);
        
        result =  (catADistance < catBDistance) ? "Cat A" :
                        (catBDistance < catADistance) ? "Cat B": "Mouse C"; 
        
        return result;
    }
}
