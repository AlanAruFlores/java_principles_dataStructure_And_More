package com.ar.magic_square;
import java.util.*;

public class Main {
	/*
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    public static int formingMagicSquare(List<List<Integer>> s) {
    // Write your code here
          int[][][] squaresArr = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
        };
        
        int minCost = Integer.MAX_VALUE;
        
        for(int[][] square :  squaresArr){
            
            minCost = Math.min(minCost, getCost(square, s));
        }    
        
        return minCost;
    }
    
    public static int getCost(int[][] square, List<List<Integer>> a){
        
        int cost = 0;
        for(int i = 0 ; i < square.length ; i++){
            for(int j = 0 ; j < square[0].length; j++){
                cost += Math.abs(square[i][j] - a.get(i).get(j));
            }
        }
        return cost;
        
    }
}
