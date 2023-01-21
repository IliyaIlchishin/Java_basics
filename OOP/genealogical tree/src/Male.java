import javax.naming.Name;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Random;

public class Male extends Human {

    protected String gender = "Male";
    private int Age = 0;
    private String FatherName = "";
    private String MotherName = "";

    protected boolean AnyBrotherSister = false;
    protected boolean AnyChildren = false;
    protected ArrayList<String> BrothersSisters = new ArrayList<>();
    protected ArrayList<String> Children = new ArrayList<>();


    Male(int age, String FName, String MName) {
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


    protected Human MakeChild(Male a, Female b) {


        Random rnd = new Random();
        int nxt = rnd.nextInt(1, 3);
        String gender = "";
        if (nxt == 1) {
            gender = "Male";
            System.out.print("Поздравления, у вас мальчик\n");
        } else {
            gender = "Female";
            System.out.print("Поздравления, у вас девочка\n");
        }


        int age = 0;
        String MName = a.GetName();
        String FName = b.GetName();

        Human newChild;

        if (gender == "Male") {
            newChild = new Male(age, MName, FName);
            Children.add(newChild.GetName());
        } else {
            newChild = new Female(age, MName, FName);
            Children.add(newChild.GetName());
        }

//Меняем статус по детям
        if (a.AnyChildren == false) {
            a.AnyChildren = true;
        }

        if (b.AnyChildren == false) {
            b.AnyChildren = true;
        }

        return newChild;
    }


    protected void SetBrothersSisters(Male a){
        a.AnyBrotherSister = true;

    }
    public String ShowInfo() {
        String Siblings = "";
        if (AnyBrotherSister == false) {
            Siblings = "Братьев и сестер нет\n";
        } else {
            Siblings = "Брат или сестра\n";
        }
        String Child = "";
        if (AnyChildren == false) {
            Child = "Детей нет";
        } else {
            Child = "Есть дети";
        }
        return String.format("%sВозраст - %d, пол - %s\n" +
                "%s" +
                "%s \n" +
                "Отец - %s, Мать - %s\n", super.ShowInfo(), this.Age, this.gender, Siblings, Child, this.FatherName, this.MotherName);

    }

    public void ShowChildren(Male a) {

        System.out.printf("Ниже список детей %s\n", a.name);

        String AllChildren = this.Children.toString();
        if (AnyChildren = true) {
            System.out.print("" + AllChildren);

        } else {
            System.out.print("детей нет");

        }


    }
}

