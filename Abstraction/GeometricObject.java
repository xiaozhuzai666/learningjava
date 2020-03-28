package Abstraction;

import java.util.Scanner;

public abstract class GeometricObject {
    protected String color;
    //面积
    public abstract double findArea();
    //周长
    public abstract double findPerimeter();

    public abstract void getType();
}
class Circle extends GeometricObject{
    double r;
    public Circle(double r){
        this.r = r;
    }

    @Override
    public double findArea() {
        double area = Math.PI*r*r;
        return area;
    }

    @Override
    public double findPerimeter() {
        double perimeter = Math.PI*r*2;
        return perimeter;
    }

    @Override
    public void getType() {
        System.out.println("这是一个圆");
    }
}
class Rectangle extends GeometricObject{
    double l,w;
    public Rectangle(double l,double w){
        this.l = l;
        this.w = w;
    }

    @Override
    public double findArea() {
        double area = l*w;
        return area;
    }

    @Override
    public double findPerimeter() {
        double perimeter = 2*(l+w);
        return perimeter;
    }

    @Override
    public void getType() {
        System.out.println("这是一个矩形");
    }
}
 class Test {
    public static void prtMenu(){
        System.out.println();
        System.out.println( "--------请选择你要创建的图形--------" );
        System.out.println( "[1] 三角形" );
        System.out.println( "[2] 圆形" );
        System.out.println();
    }
    public static void prt(){
        System.err.println("输入有误!");
        Test.main(null);
    }
    public	static void createCricle(){
        Scanner sc1 = new Scanner( System.in );
        System.out.println("请输入圆的半径 r :");
        double r = sc1.nextDouble();
        GeometricObject circle = new Circle(r);
        circle.getType();
        System.out.println("圆的面积 = " + circle.findArea());
        System.out.println("圆的周长 = " + circle.findPerimeter());
    }
    public	static void createRectangle(){
        Scanner sc2 = new Scanner( System.in );
        System.out.println("请输入矩形的长 l 和宽 w :");
        double l = sc2.nextDouble();
        double w = sc2.nextDouble();
        GeometricObject rectangle = new Rectangle(l,w);
        rectangle.getType();
        System.out.println("矩形的面积 = " + rectangle.findArea());
        System.out.println("矩形的周长 = " + rectangle.findPerimeter());
    }

    public static void test() {
        prtMenu();
        Scanner sc = new Scanner(System.in);
        int sT = sc.nextInt();

        switch (sT) {
            case 1:
                createCricle();
                break;
            case 2:
                createRectangle();
                break;
            default:
                prt();
                break;
        }
    }
    public static void main( String[] args ){
        test();
}
}


