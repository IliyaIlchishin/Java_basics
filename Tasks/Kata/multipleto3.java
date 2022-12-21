package Tasks.Kata;

public class multipleto3 {

    public static void main(String[] args)
     {
        int num1 = 545;
        int multiple = mult(num1);
        System.out.println(multiple);
       
    }
    
    public static int mult(int n)
    {
        {
            while (n % 3 != 0) {
                n = n / 10;
            }
            return n < 3 ? null : n;
        }
    }
    }

