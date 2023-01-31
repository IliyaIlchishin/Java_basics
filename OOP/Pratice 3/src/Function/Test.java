package Function;

public class Test {
    public static void main(String[] args) {

        Function<Integer, String> ob = x -> String. valueOf(x) + "S";
        System.out.println(ob.apply((4)));

        //преобразовать число в строку


    }
}
