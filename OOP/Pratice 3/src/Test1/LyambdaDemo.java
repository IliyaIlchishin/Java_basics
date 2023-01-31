package Test1;

public class LyambdaDemo {

    public static void main(String[] args) {
        NumericTest isFactor = (n,d) ->(n%d) ==0;
        if (isFactor.test(10,2)){
            System.out.printf("2 is a devider of 10\n");
        }
        if (!isFactor.test(10,3)){
            System.out.printf("3 is not devider of 10\n");

        }

        NumericTest isFator2 = (m,n) ->(n<m);
        if (isFator2.test(2,10)){
            System.out.printf("2 < 10\n");
        }
        if (!isFator2.test(10,2)){
            System.out.printf("10!< 2\n");
        }
        NumericTest abcEqual = (n,m) -> (n<0?-n:n)==(m<0?-m:m);
        if (abcEqual.test(4,-4)){
            System.out.printf("4 = |-4|\n");
        }
        if (!abcEqual.test(10,2)){
            System.out.printf("4!=|-5|\n");
        }
    }
}
