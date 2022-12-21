package Tasks.Kata;
import java.util.Arrays;

public class minoutofArray {
    
public static void main(String[] args) {

    int[] testarray = {0,562,43,-32,64,12,63,943,232,11};
    int min = MinNum(testarray);
    int max = MaxNum(testarray);
    System.out.printf("min: %d, max: %d\n", min, max);

}
  

public static int MinNum (int[] list) {
    return Arrays.stream(list).min().getAsInt();
  }
  
public static int MaxNum (int[] list) {
    return Arrays.stream(list).max().getAsInt();
 
    }
}

