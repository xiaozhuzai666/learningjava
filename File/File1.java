package File;

import java.io.BufferedReader ;
import java.io.IOException ;
import java.io.InputStreamReader ;

public class File1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader( System.in ));
    String str;
    int array[]=new int[10];
    for(int i=0;i<10;i++){
        System.out.println("输入一个整数");

        str = br.readLine();
        array[i]= Integer.parseInt (str);
    }
        for (int j = 0;j<9;j++) {
            for (int k = j + 1; k < 10; k++) {
                if (array [k] < array [j]) {
                    int temp=array[k];
                    array[k]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int m = 0;m<10;m++){
            if (m!=9)
                System.out.print(array[m]+",");
            else System.out.print(array[m]);
        }
    }
}

