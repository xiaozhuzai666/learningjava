package File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) throws IOException {
        try{
            System.out.println("请输入:");
            File myfile =new File("save.txt");
            byte[] outCh = new byte[100];
            int bytes  = System.in.read(outCh,0,100);
            FileOutputStream Fout = new FileOutputStream(myfile);
            Fout.write(outCh,0,bytes);
            byte[] inCh = new byte[bytes];
            FileInputStream Fin = new FileInputStream(myfile);
            Fin.read(inCh);
            System.out.println(new String(inCh));
        }catch (IOException e){
            System.out.println(e.toString());
        }

        }}

