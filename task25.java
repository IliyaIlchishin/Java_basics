import HW01.Library;



public class task25 {
    
    public static void main(String[] args) {
        int num = 9;

        SumOfNums(num);

    }

    static void SumOfNums(int num) 
    {
        int i = 0 ;
        var sum = 0;
        while (i<=num)
        {
            sum = sum + i;
            i++;
        }

        System.out.println(sum);

    }
}



//Найти сумму чисел от 1 до А