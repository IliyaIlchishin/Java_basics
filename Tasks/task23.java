package Tasks;


public class task23 {

    public static void main(String[] args) {
        
        int [] lst = {2,3,4,5,6};
        int num = 1000;

        NumQube(lst);
        Square(num);

    }

    static void NumQube (int [] list) 
    {
        //int [][] qubes = new int[list.length][list.length];

        for (int i = 0; i < list.length; i++ )
        {
        
            int res = list[i]*list[i]*list[i];
            System.out.printf("%d = %d \n",list[i], res);

        }

    }

    static void Square(int num)
    {
        for (int i =1; i <= num; i++){

            System.out.printf("square %d = %d \n", i, i*i);
        }

    }

}