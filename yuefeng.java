import javax.swing.*;
public class yuefeng {
    public static void main(String[] args) {
        String s= JOptionPane.showInputDialog("请输入星期：");//弹出一个方框输入信息
        if(s.charAt(0)=='M')
            System.out.println("今天是星期一。");
        else if(s.charAt(0)=='W')
            System.out.println("今天是星期三。");
        else if(s.charAt(0)=='F')
            System.out.println("今天是星期五。");
        else if(s.charAt(0)=='T'){
            if(s.charAt(1)=='u')
                System.out.println("今天是星期二。");
            else if(s.charAt(1)=='h')
                System.out.println("今天是星期四。");
            else
                System.out.println("错误输入"); }
        else if(s.charAt(0)=='S'){
            if(s.charAt(1)=='a')
                System.out.println("今天是星期六。");
            else if(s.charAt(1)=='u')
                System.out.println("今天是星期天。");
            else
                System.out.println("错误输入");}
        else
            System.out.println("错误输入");
    }
}


