package Test3;

import Test1.NumericTest;

public class GenericTest {

    public static void main(String[] args) {

        SomeTest<Integer> isFactor = (a,b) -> (a%b) == 0;

        if (isFactor.test(10,2)){
            System.out.printf("2 is a devider of 10\n");
        }
        if (!isFactor.test(10,3)){
            System.out.printf("3 is not devider of 10\n");

        }

        SomeTest<Double> isFactor2 = (a,b) -> (a%b) == 0;

        if (isFactor2.test(10.6,2.4)){
            System.out.printf("2 is a devider of 10\n");
        }
        if (!isFactor2.test(13.4,6.3)){
            System.out.printf("3 is not devider of 10\n");

        }

        SomeTest<String> isIn = (a,b) -> (a.indexOf(b)!= -1);
        String str = "Обобщенный функциональный интерфейс";
         System .out.printf("Test string: " + str);
         if (isIn.test(str, "слово")){
             System .out.printf("Словао найдено");}
         else {
             System .out.printf("Не найдено");
         }


    }


}
