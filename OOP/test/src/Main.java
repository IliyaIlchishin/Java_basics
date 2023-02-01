import java.beans.Beans;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}

// сравнение // equal // compare to // iterator

