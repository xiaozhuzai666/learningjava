package File;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class File3 {
    public static void main(String[] args) throws IOException {
            String str;
            FileReader file = new FileReader("D:\\hao1.txt");
            FileWriter b = new FileWriter("D:\\hao2.txt");
            BufferedWriter c = new BufferedWriter(b);
            LineNumberReader l = new LineNumberReader(file);
            while ((str = l.readLine())!=null){
                System.out.println(l.getLineNumber()+":"+str);
                c.write(str);
                c.newLine();
        }
            c.close();
            l.close();
    }
}
