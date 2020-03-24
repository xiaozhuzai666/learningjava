import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i = a;
        int j = b;
        int x =0,y =0;
        if(a < b){
            x = b;
            b = a;
            a = x;
        }
        while(b != 0){
            y = a % b;
            a = b;
            b = y;
        }
        //最小公倍数
        int t = i * j / a;
        System.out.println(i+"和"+j+"的最大公约数为："+ a);
        System.out.println(i+"和"+j+"的最小公倍数为："+ t);
    }
}

