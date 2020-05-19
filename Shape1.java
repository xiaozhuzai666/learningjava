interface Shape1 {
    final static double PI = 3.1415926;
    double area();
}
class Circle implements Shape1 {
    double r;
    public Circle(double r) {
        this.r = r;
    }
    public double area() {
        return Shape1.PI* r * r;
    }
}

class Rectangle implements Shape1 {
    double a;
    double b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double area() {
        return a * b;
    }

}
class Star implements Shape1 {
    public double area() {
        return 0;
    }
    public static boolean isStar(Shape1 s) {
        return (s instanceof Star) ? true : false;
    }
}

class ShapeForInterface {
    public static void main(String[] args) {
        Circle c = new Circle(5);

        Rectangle l = new Rectangle(3, 4);

        Star star = new Star();

        Shape1[] array = {(Shape1) c, star, star, (Shape1) l, star, star};

        for (int i = 0, j = 1; i < array.length; i++)//此处可进行改进，提高效率

            {

                if (Star.isStar(array[i]))

                    System.out.println("is  Star:" + j++);

                else

                    System.out.println("not Star area:" + array[i].area());

            }

    }

}