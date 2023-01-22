public abstract class Vehicle {

    private int weight;
    private int height;
    private int length;
    private String name;



    abstract int Movement(int MaxSpeed, int distance);

    abstract void GetSpeed ();


}
