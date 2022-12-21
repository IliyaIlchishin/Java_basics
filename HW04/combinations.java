package HW04;
import java.util.HashMap;
import java.util.Map;

public class combinations {
    public static void main(String[] args) {

        System.out.println(F(2, 120));
        System.out.println(Combination(2, 120));
        
    }

    static int F(int a, int b) {
        if (b == a)
          return 1;
        else if (b < a) {
          return 0;
        } else if (b % 2 != 0)
          return F(a, b - 1);
        else
          return F(a, b - 1) + F(a, b / 2);
      }

    static int Combination(int a, int b)

      {
          Map<Integer, Integer> LstCombo = new HashMap<>();
          LstCombo.put(a, 1);
          
          while (a < b )
          {
              a++;
              if (a%2 !=0){
                  LstCombo.put(a,LstCombo.get(a-1));
              }
  
              if (a%2 ==0){
                  LstCombo.put(a,LstCombo.get(a-1)+LstCombo.get(a/2));
              }
          }
          return LstCombo.get(b);
      }
           
     
}

 