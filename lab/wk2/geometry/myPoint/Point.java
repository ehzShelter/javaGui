package lab.wk2.geometry.myPoint;

public class Point {
    private double x;
    private double y;

    // empty constructor
    public Point() {

    }

    // valued constructor
    public Point(double argX, double argY) {
        this.x = argX;
        this.y = argY;
    }

    public void setterX(double argX)
    {
        this.x = argX;
    }

    public void setterY(double argY)
    {
        this.y = argY;
    }

    public double getX()
    {
        return this.x;
    }

    public double getY(){
        return this.y;
    }

}

