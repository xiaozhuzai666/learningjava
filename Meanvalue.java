import java.util.Scanner;
public class Meanvalue {
        public static void main(String[] args) {
            //输入任意参数，求平均数
            double[] s = new double[10];
            Scanner sc = new Scanner(System.in);
            int i;
            double value = 0;
            for (i = 0; i < 10; i++) {
                s[i] = sc.nextDouble();
                double m = avg(s[i]);
            }

        }


//        //求平均数的方法
       public static double avg(double ...a) {
           double sum = 0;
           try {
                   if (a < 0) {
                       throw new RuntimeException();}
                   else{
                       sum = sum + a;
                   }
               } catch (Exception e){
               e.printStackTrace();
           }
                   return sum / a.length;
        }




