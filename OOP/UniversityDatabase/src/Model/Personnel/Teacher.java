package Model.Personnel;

public class Teacher extends Profile {

    protected int salary;
    protected String role = "Teacher";


    public Teacher(String Name, String FName, int age, int MobilePhone) {
        super(Name, FName, age, MobilePhone);

    }

    public int GetSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return "\nid: " + GetID() +
                ", Имя - " + GetName() + ", Фамилия - " + GetFName() +
                ", Статус - " + role +
                "\nвозраст " + GetAge() +
                ", мобильный - " + GetMobile() +
                ", зарплата " + GetSalary();
    }



}
