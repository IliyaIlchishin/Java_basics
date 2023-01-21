public class Animal {


    private String type;
    private int height;
    private int length;
    private int weight;

    Animal (String type, int height, int length, int weight ){

        SetType(type);
        SetHeight(height);
        SetLength(length);
        SetWeight(weight);

    }

    Animal(){
        type = "нечто";
        height = 5;
        length= 5;
        weight = 0;
    }

    public String GetType() {
        return type;
    }

    protected String SetType(String type) {
        this.type = type;
        return type;
    }

    public int GetHeight() {
        return height;

    }

    protected int SetHeight(int height) {
        this.height = height;
        return height;
    }

    public int getLength() {
        return length;
    }

    protected int SetLength(int length) {
        this.length = length;
        return length;

    }

    public int GetWeight() {
        return weight;
    }

    protected int SetWeight(int weight) {
        this.weight = weight;
        return weight;

    }

    protected String Voice ()
    {
        String voice = "";
        return voice;
    }

    public static void PrintChars(Animal a)
    {
        System.out.printf("type - %s, height - %d cm \n", a.type, a.height);
    }



}
