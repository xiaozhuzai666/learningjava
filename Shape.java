public abstract class Shape {
    protected double x1;
    protected double y1;
    protected double x2;
    protected double y2;

    Shape(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}
class Square extends Shape{
    Square(double x1, double y1, double x2, double y2){
        super (x1, y1, x2, y2);
    }
    public String center () {
        return "(" + (x2 - x1) / 2 + "," + (y2 - y1) / 2 + ")";
    }
    public double diameter (){
        return Math. sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    public double getArea() {
        return (x2 - x1) * (x2 - x1) + (y2 - y1) + (y2 - y1);
    }
}
class Circle extends Shape{
    Circle(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }
    public String center() {
        return "(" + (x2 - x1) / 2 + "," + (y2 - y1) / 2 + ")";
    }
    public double diameter() {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
    public double getArea () {
        return 3.14 * (x2 - x1) * (x2 - x1) + (y2 - y1) + (y2 - y1) / 4;
    }
    public static void main(String[] args){
        Square a = new Square(1.0,2.0,3.0,4.0);
        Circle b= new Circle(2.0, 3.0,4.0,5.0);
        System.out.print("中心坐标为：");
        System.out.println(a.center());
        System.out.print("外界直径为");
        System.out.println(a.diameter());
        System.out.print("面积为");
        System.out.println(a.getArea());
        System.out.print("中心坐标为：");
        System.out.println(b.center());
        System.out.print("外界直径为");
        System.out.println(b.diameter());
        System.out.print("面积为");
        System.out.println(b.getArea());

    }
}
