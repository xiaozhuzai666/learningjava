import java.util.Scanner;

public class Circlearea {

        public static void main(String[] args) {
           double r,s;
            Scanner sc  = new Scanner(System.in);
            r = sc.nextDouble();
            s = area(r);
            System.out.println(s);
        }
        public static double area(double r){
            try {
                if(r<=0){
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Math.PI*r*r;
        }
}

