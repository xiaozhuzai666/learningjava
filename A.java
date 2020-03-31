import java.util.Scanner;

public class A {


        int v = 100;

        int mun;

        public void guess(){

            System.out.println("输入一个数：");
            while(true){
                Scanner sc = new Scanner(System.in);
                int mun = sc.nextInt();
                if (mun<v){
                    System.out.println("小了");
                }
                else if (mun>v){
                    System.out.println("大了");
                }
                else {
                    System.out.println("猜对了");
                    break;
                }
            }

        }

    public static void main(String[] args) {
        A a = new A();
        a.guess();
    }
}
