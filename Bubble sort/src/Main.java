public class Main {
    public static void main(String[] args) {


    int [] array = {35,84,12,9, 44, 95, 66, 75,89};
    array = BubbleSort(array);
        System.out.println("-------------------------");
    for (int x = 0; x < array.length; x++){
        System.out.println(""+ array[x]);
    }



    }


    public static int [] BubbleSort (int [] array){

        int temp = 0;
        int x = 0;

        while (x < array.length -1) {

            for (int i=0; i < array.length-1;i++) {

            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        x++;
        }
        return array;
    }


}