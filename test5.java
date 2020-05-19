import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test5 {
    public static void inputInfo(Student stu) {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));//流的输入
        String str = null;
        System.out.print("学生的姓名：");
        try {
            str = buf.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        stu.getName(str);
        System.out.print("学生的性别：");
        try {
            str = buf.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        stu.getSex(str);
        System.out.print("学生的学号：");
        try {
            str = buf.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        stu.getNumber(str);
        System.out.print("学生的出生日期：");
        try {
            str = buf.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        stu.getData(str);
        System.out.print("学生的成绩：");
        try {
            str = buf.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        stu.getGrade(str);
        System.out.print("学生的籍贯：");
        try {
            str = buf.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        stu.getNation(str);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student stu = new Student();
        inputInfo(stu);
    }
}
