import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Iterator;

public class Male extends Human implements Child, Parent, Iterator {

    protected String gender = "Мужчина";
    String Status = "Ребенок";


    Male(String name, int age, String FName, String MName) {
        super(name, age, FName, MName);
        if (age > 11 & age < 16){Status = "Подросток";}
        if (age > 16 & age < 25){Status = "Молодой человек";}
        if (age > 25 & age < 60){Status = "Взрослый";}
        if (age > 60 & age < 100){Status = "Пожилой";}
    }

    Male() {
        super();
        if (age > 11 & age < 16){Status = "Подросток";}
        if (age > 16 & age < 25){Status = "Молодой человек";}
        if (age > 25 & age < 60){Status = "Взрослый";}
        if (age > 60 & age < 100){Status = "Пожилой";}
    }

    @Override
    public String ShowInfo() {

        //Братья и сестры
        String Siblings = "";
        String SiblingsList = this.BrothersSisters.toString();

        if (AnyBrotherSister == false) {
            Siblings = "Братьев и сестер нет";
        } else {
            Siblings = "Список братьев и сестер:";
            Siblings = Siblings + SiblingsList;
        }

        // Дети
        String AllChildren = this.Children.toString();
        String Child = "";

        if (AnyChildren == false) {
            Child = "Детей нет";
        } else {
            Child = "Есть дети: ";
            Child = Child + AllChildren;
        }


        //Друзья

        String AllFriends = this.Friends.toString();
        String Friend = "Список друзей: ";
        Friend = Friend + AllFriends;

        // Работа

        return String.format("Имя - %s, пол - %s, Возраст - %d, ID - %d  \n" +
                "Статус - %s\n" +
                "%s\n" + // наличие братьев
                "%s \n" + // дети
                "Отец - %s, Мать - %s\n" +
                "%s \n" +
                "%s\n", this.name, this.gender, this.age, this.id,this.Status, Siblings, Child, this.FatherName, this.MotherName,this.WorkStatus,Friend);

    }

    protected String getGender() {
        return gender;
    }

    protected Human MakeChild(Male a, Female b) {

        Random rnd = new Random();
        int nxt = rnd.nextInt(1, 3);
        String gender = "";
        if (nxt == 1) {
            gender = "Мужчина";
            System.out.print("Поздравления, у вас мальчик\n");
        } else {
            gender = "Женщина";
            System.out.print("Поздравления, у вас девочка\n");
        }

        int age = 0;
        String FName = a.GetName();
        String MName = b.GetName();
        String ChildName = SetName();

        Human newChild;

        if (gender == "Мужчина") {
            newChild = new Male(ChildName, age, FName, MName);
            Children.add(newChild.GetName());
        } else {
            newChild = new Female(ChildName, age, FName, MName);
            Children.add(newChild.GetName());
        }
        // Меняем статус наличия братьев и сестер
        if (a.AnyChildren == true  ) {
            newChild.AnyBrotherSister = true;
            newChild.BrothersSisters.add(a.Children.toString());
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



    @Override
    public void MakeFriendsWith(Human a, Human b) {
        if (a.age < b.age+5 & b.age>a.age-5 ){
            a.Friends.add(b.name);
            b.Friends.add(a.name);
            System.out.printf("Теперь %s и %s друзья ", a.name, b.name);
        }
        else{System.out.printf("%s и %s не могут быть друзьями. разница в возрасте лишком велика ", a.name, b.name);}
    }

    @Override
    public int Working() {
        return 0;
    }

    @Override
    public int GetSalary() {
        return 0;
    }



    int index;

    @Override
    public boolean hasNext() {
        return index++ < 7;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                //return firstName;
                return String.format("Name: %s", name);
            case 2:
                return String.format("gender: %d", gender);
            case 3:
                return String.format("Status: %d", Status);
            case 4:
                return String.format("Father name: %s", FatherName);
            case 5:
                return String.format("Mother name: %d", MotherName);
            case 6:
                return String.format("age: %d", age);
            default:
                return String.format("Работа: %d", WorkStatus);

        }
    }

}
