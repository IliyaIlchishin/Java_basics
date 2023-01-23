import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] initialArray = new int [15];
        initialArray = RandomArray(initialArray);
        PrintArray(initialArray);

        System.out.printf("_________________________________________________________________________________\n");
        initialArray = QuickSort(initialArray, 0, initialArray.length-1);
        PrintArray(initialArray);






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

;    public static void PrintArray (int [] array){

        for (int i = 0; i < array.length; i++){
            System.out.printf("%d, ",array[i]);
        }
        System.out.print("\n");

    }

    public static int [] QuickSort (int [] array, int minIndex, int maxIndex)
    {
        if (minIndex >= maxIndex) return array;

        int pivotIndex = GetPivotIndex(array, minIndex,maxIndex);

        QuickSort(array,minIndex, pivotIndex-1);
        QuickSort(array,pivotIndex+1, maxIndex);
        return array;
    }

    public static int GetPivotIndex (int [] array, int minIndex, int maxIndex)
    {
        int pivot = minIndex - 1;
        for (int i = minIndex; i <= maxIndex;i++){

            if (array[i]< array[maxIndex]){
                pivot++;
                Swap (array [pivot], array [i]);
            }

        }
        pivot++;
        Swap(array[pivot],array[maxIndex]);

    return pivot;
    }

    public static void Swap (int leftitem, int rightitem){
      int temp = leftitem;
         leftitem   =   rightitem;
         rightitem = temp;
    }
}