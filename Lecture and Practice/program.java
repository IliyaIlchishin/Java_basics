package Lecture1;

import java.util.Random;

/**
 * program
 */
public class program {

    public static void main(String[] args) {

        String [] names = new String [10];
        names [0] = "James";
        names [1] = "George";


        System.out.println(names.length);
        System.out.println(names[1]); 


        int[][] arr = new int[3][5];
       
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] =  arr[i][j];
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();


        
    } 
    }

}

