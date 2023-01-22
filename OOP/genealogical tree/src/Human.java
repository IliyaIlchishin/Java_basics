
import java.util.Random;
import java.util.Scanner;


public abstract class Human {


    protected String name;
    protected static int id = 0;

    protected int age;


    Human(){
        name = SetName();
        id ++;
    }

    public String GetName()
    {
        return name;
    }

    protected String SetName() {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Пожалуйста введите имя - ");
        this.name = myScanner.nextLine();
        //myScanner.close();
        return name;
    }

    public void GetID()
    {
        System.out.print(id);
    }
    protected int SetID ()
    {
        int id = this.id +1;
        return id;
    }

    public String
    ShowInfo(){
        return String.format ("Имя - %s, ID - %d\n", name,id);
    }

}
