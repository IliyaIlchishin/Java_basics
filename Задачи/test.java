package Задачи;

public class test {
    public static void main(String[] args) 
    {
        
    int month = 3;
      
    String first = "Firts quarter";
    String second = "Second quarter";
    String third = "Third quarter";
    String fourth = "Fourth quarter";
        
      if (month <=3)
      {
        System.out.print(first);
      }
      if (month > 3 & month < 7)
      {
        System.out.print(second);
      }
      if (month > 6 & month < 10)
      {
        System.out.print(third);
      }
      if (month >9)
      {
        System.out.print(fourth);
      }
    }




}
