package Tasks;

public class monthToQuarter {

  public static void main(String[] args) {
    int month = 8;
    int quarter = quarterOf(month);
    System.out.println(quarter);
    
  }

  public static int quarterOf(int i) 
  {
  return (i-1)/3+1;

  }

}

