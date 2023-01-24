import java.util.*;

public class Female extends Human {

    protected String gender = "Женщина";
    String Status = "Ребенок";


    Female(String name, int age, String FName, String MName) {
        super(name, age, FName, MName);
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

        return String.format("Имя - %s, пол - %s, Возраст - %d, ID - %d  \n" +
                "Статус - %s\n" +
                "%s\n" + // наличие братьев
                "%s \n" + // дети
                "Отец - %s, Мать - %s\n" +
                "%s\n", this.name, this.gender, this.age, this.id,this.Status, Siblings, Child, this.FatherName, this.MotherName,Friend);

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

        Human newChild;

        if (gender == "Мужчина") {
            newChild = new Male(SetName(), age, FName, MName);
            Children.add(newChild.GetName());
        } else {
            newChild = new Female(SetName(), age, FName, MName);
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


}



