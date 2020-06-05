
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


class cal extends Frame implements ActionListener
{
    private Button plus,minus,mul,div;
    private TextField Text1,Text2,Text3;
    private int a,b;

    public cal(){
        super("计算器小程序");

        plus=new Button("+");
        minus=new Button("-");
        mul=new Button("*");
        div=new Button("/");


        Text1=new TextField("输入第一个数",20);
        Text2=new TextField("输入第二个数",20);
        Text3=new TextField("结果",20);
        //Text1.setEditable(false);

        this.setSize(300,200);
        this.setBackground(Color.blue);
        this.setLocation(300,240);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.add(Text1);
        this.add(Text2);
        this.add(Text3);
        this.add(plus);
        this.add(minus);
        this.add(mul);
        this.add(div);


        plus.addActionListener(this);
        minus.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        this.addWindowListener(new Wadapt());

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        a = Integer.parseInt(Text1.getText());
        b = Integer.parseInt(Text2.getText());
        if(e.getSource()==plus){
            String s = String.valueOf(a+b);
            Text3.setText(s);}
        else if(e.getSource()==minus){
            String s = String.valueOf(a-b);
            Text3.setText(s);}
        else if(e.getSource()==mul){
            String s = String.valueOf(a*b);
            Text3.setText(s);}
        else if(e.getSource()==div){
            if (b==0) {Text3.setText("不合法的数据！");}
            else {
                String s = String.valueOf(a/b);
                Text3.setText(s);}
        }
    }
    public static void main(String args[])
    {
        cal mycal=new cal();
    }
}
class Wadapt extends WindowAdapter {
    public void windowClosing(WindowEvent evt) {
        Frame frm = (Frame) evt.getSource();
        frm.setVisible(false);
        frm.dispose();
        System.exit(0);
    }

}