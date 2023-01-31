
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
    protected String gender;
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
    Human(){
        Random rnd = new Random();
        int nxt = rnd.nextInt(1, 3);
        String gender = "";
        if (nxt == 1) {
            gender = "Мужчина";
        } else {
            gender = "Женщина";
        }
        if(gender=="Мужчина"){this.name = MaleRandomNames();}
        if(gender=="Женщина"){this.name = FemaleRandomNames();}
        this.age = randomAge();
        this.FatherName = MaleRandomNames();
        this.MotherName = FemaleRandomNames();
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

    public String MaleRandomNames(){
        ArrayList<String> MaleNames = new ArrayList<>();
        MaleNames.add("Александр");
        MaleNames.add("Леонид");
        MaleNames.add("Макар");
        MaleNames.add("Евгений");
        MaleNames.add("Юрий");
        MaleNames.add("Сергей");
        MaleNames.add("Георгий");
        MaleNames.add("Филимон");
        MaleNames.add("Илья");
        MaleNames.add("Михаил");
        MaleNames.add("Павел");
        MaleNames.add("Никита");
        MaleNames.add("Дмитрий");
        MaleNames.add("Григорий");
        MaleNames.add("Герман");
        MaleNames.add("Петр");
        MaleNames.add("Аффанасий");
        MaleNames.add("Леопольд");
        Random rnd = new Random();
        int nxt = rnd.nextInt(1, MaleNames.size());
        String RndName = MaleNames.get(nxt);

        return RndName;
    }

    public String FemaleRandomNames(){
        ArrayList<String> FemaleNames = new ArrayList<>();
        FemaleNames.add("Александра");
        FemaleNames.add("Евгений");
        FemaleNames.add("Елена");
        FemaleNames.add("Татьяна");
        FemaleNames.add("Диана");
        FemaleNames.add("Ксения");
        FemaleNames.add("Екатерина");
        FemaleNames.add("Дарья");
        FemaleNames.add("Анастасия");
        FemaleNames.add("Наталья");
        FemaleNames.add("Маша");
        FemaleNames.add("Тамара");
        FemaleNames.add("Ксения");
        FemaleNames.add("Света");
        Random Mrnd = new Random();
        int nxt = Mrnd.nextInt(1, FemaleNames.size());
        String RndName = FemaleNames.get(nxt);

        return RndName;
    }

    int randomAge(){
        Random rnd = new Random();
        int age = rnd.nextInt(1, 80);
        return age;
    }


    public void MakeFriendsWith(Human a, Human b) {}

}

