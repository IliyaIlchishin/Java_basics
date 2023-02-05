package Model.Personnel;

public abstract class Profile {

    //начальный класс от которого наследуют стуженты и учителя


    protected String Name;
    protected String FName;
    protected int age;
    protected int id = 0;
    protected int MobilePhone;

    private static int IdCount = 0;

    protected Profile(String Name, String FName, int age, int MobilePhone){
        this.Name = Name;
        this.FName = FName;
        this.age = age;
        this.MobilePhone = MobilePhone;
        this.id = IdCount;

        IdCount++;
    }

    public String GetName (){
        return this.Name;
    }

    protected void SetName (Profile a, String name){
        a.Name = name;
    }

    public String GetFName (){

        return this.FName;
    }

    protected void SetFName (Profile a, String name){
        a.FName = name;
    }

    public int GetAge (){
        return this.age;
    }

    protected void SetAge (Profile a, int age){
        a.age = age;
    }

    public int GetID (){

        return this.id;
    }


    public int GetMobile (){

        return this.MobilePhone;
    }

    protected void SetMobile (Profile a, int mobile){
        a.MobilePhone = mobile;
    }


    public String toString() {
        return "\nИмя -" + GetFName() + ", Фамилия - " + GetFName() +
                ", id: " + GetID() +
                "\nвозраст " + GetAge() +
                ", мобильный: " + GetMobile();
    }





}
