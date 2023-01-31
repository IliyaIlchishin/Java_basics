package Consumer;

public class main {
    public static void main(String[] args) {

        Consumer<Integer> printer = x -> System.out.printf("%d $\n", x);
        printer.accept(300);


    }
}
