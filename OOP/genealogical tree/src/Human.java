
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public abstract class Human {


    protected String name;
    protected int id = 0;
    protected static int count = 0;
    protected int age;
    protected String FatherName = "";
    protected String MotherName = "";
    protected int Money = 0;
    protected String WorkStatus = "Безработный";
    protected String WorkPosition;

    protected boolean AnyBrotherSister = false;
    protected boolean AnyChildren = false;

    protected ArrayList<String> BrothersSisters = new ArrayList<>();
    protected ArrayList<String> Children = new ArrayList<>();
    protected ArrayList<String> GrandFather = new ArrayList<>();
    protected ArrayList<String> GrandMother = new ArrayList<>();
    protected ArrayList<String> Friends = new ArrayList<>();

    Human(String name,int age, String FName, String MName){
        this.name = name;
        this.age = age;
        this.FatherName = FName;
        this.MotherName = MName;
        count ++;
        this.id = count;
        this.Money = 0;
    }

    public String GetName(){
        return this.name;
    }

    protected String SetName() {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Пожалуйста введите имя - ");
        String Name = myScanner.nextLine();
        //myScanner.close();
        return Name;
    }

    protected int GetID(){
        return this.id;
    }
    /** Показываем всю информацию о выбранном экземпляре класса Human */
    public abstract String ShowInfo();

    public int getAge(){
        return this.age;
    }

    protected int SetAge(){
        this.age = age;
        return age;
    }

    protected  String GetFatherName() {
        return FatherName;
    }
    protected String GetMotherName() {
        return MotherName;
    }
    protected String SetFatherName() {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Пожалуйста введите имя отца - ");
        this.FatherName = myScanner.nextLine();
        //myScanner.close();
        return FatherName;
    }

    protected String SetMotherName() {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Пожалуйста введите имя матери - ");
        this.MotherName = myScanner.nextLine();
        //myScanner.close();
        return MotherName;
    }




}

