package Tasks;
import java.nio.channels.NonReadableChannelException;
import java.util.Scanner;


public class task42 {
    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter numbers using , to devide them");
        String numbers = myScanner.nextLine();
        System.out.println(numbers);
        myScanner.close();
    }

    public static void NumsCount (String nums)
    {

    }


}






//Определить сколько чисел больше 0 введено с клавиатуры