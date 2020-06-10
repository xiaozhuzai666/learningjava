import java.util.Arrays;
import java.util.Scanner;

    public class haoyunlai {

        public static void main(String[] args) {
            int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
            System.out.print("原来的数组：");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.print("输入一个数：");
            int addNumber = sc.nextInt();
            a = Arrays.copyOf(a, a.length + 1);
            a [a.length - 1] = addNumber;
            int i = 0;
            if (a[i] <= a[a.length - 2]) {
                Arrays.sort(a);// 排序
                System.out.print("现在的数组为：");
                for (i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }
            } else {
                Arrays.sort(a);// 再次排序
                System.out.print("插入一个数后的数组为：");
                for (i = a.length - 1; i >= 0; i--) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }


