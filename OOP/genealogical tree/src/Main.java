import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        ArrayList<Male> Men = new ArrayList<>(5);
        for (int i = 5; i > 0; i--){
            Men.add(new Male());
        }
        ArrayList<Female> Women = new ArrayList<>(5);
        for (int i = 5; i > 0; i--){
            Women.add(new Female());
        }

        System.out.print(Men.get(0).ShowInfo());
        System.out.print("---------------------------------------------------\n");
        System.out.print(Women.get(2).ShowInfo());
        System.out.print("---------------------------------------------------\n");




        // Бюджет семьи
        BinaryOperator<Integer> FamilyMoney = (x, y) -> x * y;
        int budget = FamilyMoney.apply(Men.get(0).Money, Women.get(0).Money);


        //перевод в стринг
        Consumer<Integer> printer = x -> System.out.printf("Текущий бюджет семьи %d $\n", x);
        printer.accept(budget);
        //еще один вариант преобразовать число в строку
        Function<Integer, String> ob = x -> String.valueOf(x) + "Текущий бюджет семьи";
        System.out.println(ob.apply((budget)));



/*
1 - Сделать генератор имен
2 - генератор возраста

*/

        // Создаем детей
        Human Baby1 = Men.get(0).MakeChild(Men.get(0), Women.get(0));
        Human Baby2 = Men.get(1).MakeChild(Men.get(1), Women.get(0));
        Human Baby3 = Men.get(2).MakeChild(Men.get(2), Women.get(0));

        System.out.print(Baby1.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        System.out.print(Baby2.ShowInfo());
        System.out.print("---------------------------------------------------\n");

        Baby1.MakeFriendsWith(Baby1, Baby2);



        System.out.print("-------------Обновленная инфа по детям--------------\n");
        System.out.print(Baby1.ShowInfo());
        System.out.print("---------------------------------------------------\n");
        System.out.print(Baby2.ShowInfo());
        System.out.print("---------------------------------------------------\n");


        //Обновленная инфа по отцу и матери
        System.out.print(Men.get(0).ShowInfo());
        System.out.print("---------------------------------------------------\n");


        //Создаем супермаркет

        Building Five = new Supermarket("Пятерочка", 15);
        Human Josh = new Male("Джош", 24, "Иван", "Анжелика");
        Josh = Workplace.Hire(Josh);
        System.out.print("---------------------------------------------------\n");
        System.out.print("---------------------------------------------------\n");
        System.out.print("---------------------------------------------------\n");


    }}