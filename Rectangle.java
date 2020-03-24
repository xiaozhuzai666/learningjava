import java.util.Scanner;

public class Rectangle {
    int height;
    int width;
    int getArea(){
        return height*width;
    }
    int getPerimeter(){
        return (height+width)*2;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner num = new Scanner(System.in);
        rect.height = num.nextInt();
        rect. width = num.nextInt();
        System.out.println(rect.getArea()+" "+rect.getPerimeter());
    }
}
