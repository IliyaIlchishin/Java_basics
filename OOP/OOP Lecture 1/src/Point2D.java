public class Point2D
{
    private int x,y;

    public Point2D (int valueX, int valueY)
{
   x = valueX;
   y = valueY;

}

    public Point2D(int value) {
        this(value, value);
    }

    public int getX (){
        return this.x;
    }

    public int getY (){
        return this.x;
    }

    public void setX (int value) {
        this.x=value;
    }
    public void setY (int value) {
        this.y = value;
    }

    public String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }
    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance (Point2D a, Point2D b)
    {
        return Math.sqrt(Math.pow(a.x - b.x, 2)) + Math.pow(a.y - b.y, 2);
    }
}
