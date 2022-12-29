public class Main {
    public static void main(String[] args) {


    boolean hey = isNarcissistic(112);
    System.out.print(hey);


    }


    public static boolean isNarcissistic(int number) {

        char[] n = ("" + number).toCharArray();
        int[] digits = new int[n.length];
        for (int i = 0 ; i < digits.length ; i++)
            digits[i] = n[i] - '0';

        int length = digits.length;
        double sum = 0;

        for (int i = 0; i<digits.length; i++)
        {
            sum = sum + (Math. pow(digits[i],length) );

        }

        if (sum == number){
            System.out.print("sum - ");
            System.out.print(sum);
            return true;
        }
        else {
            System.out.print("sum - ");
            System.out.print(sum);
            return false;
        }

    }

    //1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
}