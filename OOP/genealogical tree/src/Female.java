import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Female extends Human {

    protected String gender = "Female";
    private int Age = 0;
    private String FatherName = "";
    private String MotherName = "";

    protected boolean AnyBrotherSister = false;
    protected boolean AnyChildren = false;


    Female(int age, String FName, String MName) {
        super();
        SetAge(age);
        FatherName = FName;
        MotherName = MName;
    }

    public int getAge() {
        return Age;
    }

    protected int SetAge(int age) {
        this.Age = age;
        return age;
    }

    protected String getGender() {
        return gender;
    }

    public String GetFatherName() {
        return FatherName;
    }

    protected String SetFatherName() {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Пожалуйста введите имя отца - ");
        this.FatherName = myScanner.nextLine();
        //myScanner.close();
        return FatherName;
    }

    public String GetMotherName() {
        return MotherName;
    }

    protected String SetMotherName() {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Пожалуйста введите имя матери - ");
        this.MotherName = myScanner.nextLine();
        //myScanner.close();
        return MotherName;
    }


    protected boolean SetBrotherSister() {

        return true;
    }

    protected boolean SetChildren() {

        return true;
    }

    protected void MakeChild(Male a, Female b) {


    }

    Map<String, String> BrothersSisters = new HashMap<>();
    Map<String, String> Children = new HashMap<>();


    public String ShowInfo(){
        String Siblings ="";
        if (AnyBrotherSister == false){
            Siblings = "Братьев и сестер нет\n";
        }
        else { Siblings = "Брат или сестра\n";}
        String Child ="";
        if (AnyChildren == false){
            Child = "Детей нет";
        }
        else {Child = "Есть дети";}
        return String.format("%sВозраст - %d, пол - %s\n" +
                "%s"+
                "%s \n"+
                "Отец - %s, Мать - %s\n", super.ShowInfo(), this.Age,this.gender,Siblings,Child,this.FatherName,this.MotherName);

    }


    }

