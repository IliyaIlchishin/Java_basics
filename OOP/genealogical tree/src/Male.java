import java.util.Random;

public class Male extends Human {

    protected String gender = "Мужчина";


    Male(String name, int age, String FName, String MName) {
        super(name, age, FName, MName);
    }

    @Override
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
        return String.format("Имя - %s, пол - %s, Возраст - %d, ID - %d  \n" +
                "%s" +
                "%s \n" +
                "Отец - %s, Мать - %s\n", this.name, this.gender, this.age, this.id, Siblings, Child, this.FatherName, this.MotherName);

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
    public String ShowChildren(Human a) {

        System.out.printf("Ниже список детей %s\n", a.name);

        String AllChildren = this.Children.toString();
        if (AnyChildren = true) {
            System.out.print("" + AllChildren);
            System.out.print("\n");

        } else {
            System.out.print("детей нет");

        }
        {
            return String.format ("Имя - %s, ID - %d\n", name,id);
        }
    }
    @Override
    public String ShowBrothersSisters(Human a) {

            System.out.printf("Список братьев и сестер %s\n", a.name);

            String BrosSis = this.BrothersSisters.toString();
            if (AnyBrotherSister == true) {
                System.out.print("" + BrosSis);

            } else {
                System.out.print("Сестер и братьев нет");

            }
            {
                return String.format ("Имя - %s, ID - %d\n", name,id);
            }
    }


}
