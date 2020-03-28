package Abstraction;

import java.util.Scanner;

public abstract class ObjectVolume {
    abstract double getVolume();
}
class Cube extends ObjectVolume{
    double v;
    Cube(double a){
        v=a*a*a;
    }
    @Override
    double getVolume() {
        return  v;
    }
}
class qiu extends ObjectVolume{
    double v;
    qiu(double a)
    {
        v=4.0/3*a*a*a*3.14;
    }
    @Override
    double getVolume() {
        return v;
    }
}
class yuanzhu extends ObjectVolume {
    double v;
    yuanzhu(double r,double h)
    {

        v=h*r*r*3.14;

    }

    @Override
    double getVolume() {
        return v;
    }
}
class main{
    static double get(ObjectVolume obj)
    {
        return obj.getVolume();
    }
    public main() {
        int a;
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入1（表示球体）、2（表示立方体）、3（表示圆柱体）");
        a=reader.nextInt();
        if(a==1)
        {
            double r,v;
            System.out.println("请输入半径");
            r=reader.nextDouble();
            qiu x=new qiu(r);
            v=get(x);
            System.out.println("球体积为"+v);
        }
        else if(a==2)
        {
            double r,v;
            System.out.println("请输入边长");
            r=reader.nextDouble();
            Cube x=new Cube(r);
            v=get(x);
            System.out.println("立方体体积为"+v);
        }
        else if(a==3)
        {
            double r,h,v;
            System.out.println("请输入半径和高");
            r=reader.nextDouble();
            h=reader.nextDouble();
            yuanzhu x=new yuanzhu(r,h);
            v=get(x);
            System.out.println("圆柱体体积为"+v);
        }
}
}
