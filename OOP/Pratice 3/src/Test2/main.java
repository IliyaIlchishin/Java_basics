package Test2;

public class main {

    public static void main(String[] args) {
        Inter f = (n) -> {
            int res = 1;
            n = n<0 ? -n:n;
            for (int i = 0; i<=n/i;i++){
                if ((n%i) ==0){
                    res = i;
                    break;
                }
            }
            return res;
        } ;
        System.out.printf("наименьшим делитемел 12 является " +  f.func(12));
        System.out.printf("наименьшим делитемел 12 является " +  f.func(11));
    }
}