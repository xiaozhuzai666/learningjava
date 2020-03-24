import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        float a = grade.nextFloat();
        if (a>=90){
            System.out.println("A");
        }
        else if (a>=60 && a<=89){
            System.out.println("B");
        }
        else if(a>=0 && a<60){
            System.out.println("C");
        }
    }
}
