package threeClass;

public class Point{
    double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(){
        this.x = 0;
        this.y = 0;
    }
}

class Circle extends Point {
    double r;
    public Circle(double x,double y,double r ){
        super(x,y);
        this.r = r;
    }
    public double Area(){
        double area = Math.PI*r*r;
        return area;
    }
}
class Cylinder extends Circle{
    double h;
    public Cylinder(double x, double y, double r,double h) {
        super(x, y, r);
        this.h = h;
    }
    public double bArea(){
        double area =Area()*2+Math.PI*r*2*h;
        return area;
    }
    public double Volume(){
        double volume = Area()*h;
        return volume;
    }
}
class Main{
    public static void main(String[] args) {
        Circle m = new Circle(2,3,4);
        Cylinder n = new Cylinder(3,4,5,6);
        System.out.println("圆的面积为："+m.Area());
        System.out.println("圆柱的表面积为："+n.bArea());
        System.out.println("圆柱的体积为："+n.Volume());
    }
}