package HW01;
import java.util.*;



public class lesson1 {
    
    public static void main(String[] args) {
        
        int [] NumList = new int [] {1, 9, 7, 4, 9, 3, 0, 2, 8, 0, 9, 4, 6, 3, 5, 6, 5 };
        CharRepetition(NumList);
        HW01.Library.help();
    }
    public static void CharRepetition (int [] list) 
    {
        Set<Integer> UniqueNumbers = new HashSet<Integer>();
        for ( int i = 0; i < list.length; i ++ )
        {
            UniqueNumbers.add(list[i]);
        }
        //Конвертирую в список массив c элементами
        int [] UNumbersList = UniqueNumbers.stream().mapToInt(Integer::intValue).toArray();
        
        System.out.print(UNumbersList);

        int length = UNumbersList.length;
        //массив, в котором будет лежать кол-во повторений
        int [] repetition = new int [length];

        for ( int i = 0; i < UNumbersList.length; i ++ )
        {
            int count = 0;
            for ( int j = 0; j < list.length; j ++ )
            {
                if (UNumbersList[i] == list[j])
                {
                    count++;
                }
            }
            repetition[i] = count;
        }
        //System.out.println(UniqueNumbers);
        //System.out.println(repetition);
        // Почему-то при печати списка выдает I@764c12b6
        for ( int i = 0; i < repetition.length; i ++ )
        {
            System.out.printf("элемент %d появляется %d раз \n",UNumbersList[i],repetition[i]);
        }


        System.out.println(Arrays.toString(repetition));
    }
    
}
