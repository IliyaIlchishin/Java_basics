package lectures;
import java.util.ArrayList;



public class j2 {
    public static void main(String[] args) {

        int [] nums = new int [] {1, 5, 2, 3, 4, 6, 1, 7};
      
        ArrayList <Integer> sorted = new ArrayList<Integer>();
        int count = 0 ;

        for (int i : nums)
        {   
            System.out.println(i);
            if (sorted.size() == 0 && i < nums[i+1])
            {
                sorted.add(i);
            }

            if (count < nums.length-3)
            
            {
                if ( i > nums[i-1])
                {
                    sorted.add(i);
                }
                

            }   
            count++;
            //System.out.println(count);
        }

        System.out.println(sorted);
        
    }
    
}




// Дан список чисел. Создать список в который попадают числа, описывающие возрастающую последовательность и содержащие максимальное количество элементов.
// Пример: [1, 5, 2, 3, 4, 6, 1, 7] => [1, 2, 3, 4, 6,1]
// [5, 2, 3, 4, 6, 1, 7] => [2, 3, 4, 6, 7]
// Порядок элементов менять нельзя