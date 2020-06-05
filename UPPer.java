import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
public class UPPer {
    public static void main(String [] args)throws IOException {
        File fl = new File("D:\\Early-Precaution.txt");
        FileInputStream fs = new FileInputStream(fl);
        int count,size;
        size = fs.available();
        char [] text = new char [size];
        for(count = 0; count <size; count ++){
            text [count] =((char)fs.read());
    }
        fs.close();
        for(int i = 0; i<size; i++) {
            if (text[i] >= 'A' & text[i] <= 'Z') {//判断大小写
                text[i] = Character.toLowerCase(text[i]);
            }
        }
        StringBuilder st = new StringBuilder(text[0] + "");
        for(int i = 1; i <size; i ++) {
            st.append(text[i]);
        }
        byte[] words = st.toString().getBytes();
        OutputStream fos = new FileOutputStream("D:\\joke.text",true);
        fos.write(words,0,words.length);
        System.out.println("joke文件已经更新");

    }
}

