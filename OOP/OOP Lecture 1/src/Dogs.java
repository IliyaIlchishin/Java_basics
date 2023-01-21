public class Dogs extends Animal {

    private String Breed = "";

    private int age;
    Dogs (String type, int height, int length, int weight, int age ){
        super(type,height,length, weight);
        SetAge(age);
    }

    public int GetAge (int age){
        return age;
    }
    private int SetAge (int age){
        this.age = age;
        return age;
    }
    @Override
    public String Voice ()
    {
        String voice = "Wow-Wow";
        return voice;
    }

}
