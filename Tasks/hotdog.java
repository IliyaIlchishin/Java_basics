package Tasks;

public class hotdog {
    public static void main(String[] args) {
        int price = saleHotdogs(12);
        System.out.println(price);
        
    }


    public static int saleHotdogs(final int n){
        return ( n < 5 ? 100 : n >= 5 && n < 10 ? 95 : 90 ) * n;
      }
}
