package Test4;

import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        Predicate<Integer> ob = x -> x>0;
        System.out.println(ob.test(4));
        System.out.println(ob.test(-4));

    }
}
