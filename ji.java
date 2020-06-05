import java.awt.*;
import java.util.Date;
import java.awt.event.*;
class Test9_3 extends Frame implements WindowListener
{
    String str;
    static Clock c=null;
    Test9_3(){
        super("�������Ĵ���");
        setSize(100,200);
        c=new Clock(1000);
        add(c);
        addWindowListener(this);
        setVisible(true);
    }

    public void windowOpened(WindowEvent e){}
    public void windowClosing(WindowEvent e)
    {System.exit(0);  }
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}

    public static void main(String args[]){
        Test9_3 test=new Test9_3();

        Thread t=new Thread(c);
        t.start();
    }
}
class Clock extends Panel implements Runnable{
    int sleepTime;
    int counter;
    public Clock(int x){
        sleepTime=x;
        counter=0;

    }
    public void run(){
        while(counter<1000){
            try{
                counter++;
                repaint();
                Thread.sleep(sleepTime);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public void paint(Graphics g){
        Date d=new Date(System.currentTimeMillis());
        g.drawString(d.toString(),10,100);

    }

}