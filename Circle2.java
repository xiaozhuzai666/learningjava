public class Circle2 {
    private double PI=3.14;
    private double r;
    public Circle2(){
        r=4;
    }
    public double areaCircle(){
        double area;
        area=PI*r*r;
        return area;
    }
    public double circlePerimeter(){
        double Perimeter;
        Perimeter=2*PI*r;
        return Perimeter;
    }

    public static void main(String[] args) {
        Circle2 test=new Circle2();
        System.out.println(test.areaCircle());
        System.out.println(test.circlePerimeter());
    }
}








