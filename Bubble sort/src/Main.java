import java.util.Random;

public class Main {
    public static void main(String[] args) {

    int [] array = new int [15];
    array = RandomArray(array);
    PrintArray(array);
    array = BubbleSort(array);

    }
    
    public static int [] RandomArray(int []array)
    {

        for (int i =0; i <= array.length -1; i++) {
            int a = RandomNums();
            array[i]=a;
        }

        return array;
    }
    public static int RandomNums (){
        Random RandNum = new Random();
        int upperbound = 1001;
        int int_random = RandNum.nextInt(upperbound);
        return int_random;
    }
    public static int [] BubbleSort (int [] array){

        int temp = 0;
        int count = 0;

        for (int x = 0;x < array.length; x++){
            count = x +1;
            for (int i=0; i < array.length-1;i++) {

                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.printf("count - %d \n",count);
        PrintArray(array);
        return array;

/*Будем идти по массиву слева направо.
Если текущий элемент больше следующего, меняем их местами.
Делаем так, пока массив не будет отсортирован.
*/

    }

    public static void PrintArray (int [] array){

        for (int i = 0; i < array.length; i++){
            System.out.printf("%d, ",array[i]);
        }
        System.out.print("\n");

    }



}