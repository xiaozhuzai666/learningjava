import java.util.Scanner;

public class num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String [] a=sc.nextLine().split("");
        System.out.println("长度为："+a.length);
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}
