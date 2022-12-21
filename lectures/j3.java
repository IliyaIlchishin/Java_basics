package lectures;

import java.util.random.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class j3 {
    public static void main(String[] args) {
        



        long start = System.currentTimeMillis();


        // int [] TestArray = new int [10000];
        // for (int i = 0; i<TestArray.length-1; i++)
        // {
        //     TestArray[i] = RandomNums();
        //     System.out.println(TestArray[i]);
        // }

        // ArrayList <Integer> Dates = new ArrayList<>();
        // for (int i = 0; i<100000; i++)
        // {
        //     Dates.add(RandomNums());
        // }
        // System.out.print(Dates); 
        // System.out.print("--------------------------------------\n"); 

        LinkedList <Integer> Names = new LinkedList<>();
        for (int i = 0; i<100000; i++)
        {
            Names.add(RandomNums());
        }
        System.out.print(Names); 
        System.out.print("--------------------------------------\n");

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("ms: " + elapsed);




    }


    public static int RandomNums (){
        Random RandNum = new Random(); 
        int upperbound = 10001;
        int int_random = RandNum.nextInt(upperbound); 
        return int_random;
    }
}
