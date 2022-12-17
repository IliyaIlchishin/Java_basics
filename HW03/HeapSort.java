package HW03;


public class HeapSort {


    public static void main(String[] args) {

        int[] UnsortedArray = { 12, 9, 51, 25, 3, 11, 13, 5, 15, 6, 43, 94, 7 };
        printarray(UnsortedArray);
        Heapsort(UnsortedArray);
        printarray(UnsortedArray);

    }                                        

    public static void Heapsort(int [] array)
    {
        int size = array.length;
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);
    

        for (int i = size - 1; i >= 0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            
            heapify(array, i, 0);
        }
    }

    public static void heapify(int [] array, int size, int i)
    {
        int largest = i; 
        int left = 2*i + 1;    
        int right = 2*i + 2;  
           
        if (left < size && array[left] > array[largest])   
            largest = left; 
            
        if (right < size && array[right] > array[largest])  
            largest = right;      
     
        if (largest != i) 
        {
            int swap = array[i]; 
            array[i] = array[largest];  
            array[largest] = swap;  
            heapify(array, size, largest);
        }
    }

    static void printarray(int array[])
    {
        int len = array.length;
        for (int i = 0; i < len; ++i)
            System.out.print(array[i]+ " ");
        System.out.println();
    }
  
}
 
