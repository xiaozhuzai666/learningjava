import  java.awt.Frame;
import  java.awt.Button;
import  java.awt.Label;
import  java.awt.event.ActionListener;
import  java.awt.event.ActionEvent;
import  java.awt.FlowLayout;
import  java.awt.TextField;
import  java.awt.TextArea;
import  java.awt.Dimension;
import  java.awt.Font;
import  java.awt.Color;
import  java.lang.Exception;
class  Calculator  implements  ActionListener {
        private  Frame  Fm  =  new  Frame();
        private  Button  quit  =  new  Button( "return" );
        private  Button  Add  =  new  Button( "+" );
        private  Button  Sub  =  new  Button( "-" );
        private  Button  Mul  =  new  Button( "×" );
        private  Button  Div  =  new  Button( "÷" );
        private  Label  Addend  =  new  Label( "number1" );
        private  Label  Augend  =  new  Label( "number2" );
        private  Label  Sum  =  new  Label( "answer" );
        private  TextField  fieldAdd  =  new  TextField();
        private  TextField  fieldAug  =  new  TextField();
        private  TextArea  areaSum  =  new  TextArea();
        private  Font  Ft  =  new  Font( "宋体" ,Font. BOLD ,18);
        public  Calculator()
        {
            Fm .setTitle( "简单计算器" );
            Fm .setBounds(250,100,400,400);
            Fm .setLayout( new  FlowLayout(FlowLayout. LEFT ,20,20));
            //×加数××××××××××××××××××××××××××××××××××××××××××××××××××××××××加数
            Fm .add( Addend ); //标签--加数
            Addend .setFont( Ft ); //字体类型
            Addend .setForeground(Color. black ); //设置字体颜色
            Addend .setPreferredSize( new  Dimension(100,50)); //设置组件尺寸
            Fm .add( fieldAdd ); //输入区--加数
            fieldAdd .setPreferredSize( new  Dimension(140,30)); //设置组件尺寸
            fieldAdd .setFont( Ft ); //字体类型
            fieldAdd .setForeground(Color. red );
            Fm .add( Add );
            Add .addActionListener( this );
            Fm .add( Sub );
            Sub .addActionListener( this );
            //×被加数××××××××××××××××××××××××××××××××××××××××××××××××××××被加数
            Fm .add( Augend ); //标签--被加数
            Augend .setFont( Ft );
            Augend .setForeground(Color. black );
            Augend .setPreferredSize( new  Dimension(100,100)); //设置组件尺寸
            Fm .add( fieldAug ); //输入区--被加数
            fieldAug .setPreferredSize( new  Dimension(140,30)); //设置组件尺寸
            fieldAug .setFont( Ft );
            fieldAug .setForeground(Color. black );
            Fm .add( Mul );
            Mul .addActionListener( this );
            Fm .add( Div );
            Div .addActionListener( this );
            //×和××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××和
            Fm .add( Sum ); //标签--和
            Sum .setFont( Ft );
            Sum .setForeground(Color. black );
            Sum .setPreferredSize( new  Dimension(100,30)); //设置组件尺寸
            Fm .add( areaSum );
            areaSum .setPreferredSize( new  Dimension(140,30)); //设置组件尺寸
            areaSum .setFont( Ft );
            areaSum .setForeground(Color. black );
            //×××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××退出
            Fm .add( quit );
            quit .addActionListener( this );
            Fm .setVisible( true );
        }
        public   void  actionPerformed(ActionEvent e)
        {
            try
            {
                if (e.getSource()== quit )
                    System. exit (0);
                else   if (e.getSource()== Add )
                    areaSum .setText(Double. toString (Double. parseDouble ( fieldAdd .getText()) + Double. parseDouble ( fieldAug .getText())));
                else   if (e.getSource()== Sub )
                    areaSum .setText(Double. toString (Double. parseDouble ( fieldAdd .getText()) - Double. parseDouble ( fieldAug .getText())));
                else   if (e.getSource()== Mul )
                    areaSum .setText(Double. toString (Double. parseDouble ( fieldAdd .getText()) * Double. parseDouble ( fieldAug .getText())));
                else   if (e.getSource()== Div )
                    areaSum .setText(Double. toString (Double. parseDouble ( fieldAdd .getText()) / Double. parseDouble ( fieldAug .getText())));
            }
            catch (Exception Ex)
            {
                areaSum .setText( "出错了：" +Ex);
            }
        }
        public   static   void  main(String args[])
        {
            Calculator call =  new  Calculator();
        }
    }


