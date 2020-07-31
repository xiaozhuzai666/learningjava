import java.util.Scanner;

public class sjd {
    public static void main(String[] args) {
        String str;
        Scanner sca = new Scanner(System.in);
        str = sca.nextLine();
        double dou = Double.parseDouble(str);
        System.out.printf("%.6f",dou);
    }
}
