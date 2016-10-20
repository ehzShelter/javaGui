package lab.wk2.geometry.myTriangle;

import java.lang.*;

import lab.wk2.geometry.myPoint.Point;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {

    }

    public Triangle(Point paramA, Point paramB, Point paramC) {
        this.a = paramA;
        this.b = paramB;
        this.c = paramC;
    }

    public void showInfo()
    {
        System.out.println("Point a:" + this.a.getX() + " " + this.a.getY());
        System.out.println("Point b:" + this.b.getX() + " " + this.b.getY());
        System.out.println("Point c:" + this.c.getX() + " " + this.c.getY());
    }

    public void testTriangle() {
        double MN = Math.sqrt(Math.pow((this.a.getX() - this.b.getX()), 2) + Math.pow((this.a.getY() - this.b.getY()), 2));
        double NO = Math.sqrt(Math.pow((this.b.getX() - this.c.getX()), 2) + Math.pow((this.b.getY() - this.c.getY()), 2));
        double OM = Math.sqrt(Math.pow((this.c.getX() - this.a.getX()), 2) + Math.pow((this.c.getY() - this.a.getY()), 2));


        if (MN == NO && NO == OM && OM == MN) {
            System.out.println("Equilateral Triangle");
        }
        else if (MN != NO && NO != OM && OM != MN) {
            System.out.println("scalene Triangle");
        }
        else {
            System.out.println("isoscalene");
        }
    }
}
