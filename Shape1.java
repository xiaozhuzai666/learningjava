import java.lang.Math;
interface Shape1{
    abstract double Area();
}
class Rectangle implements Shape1{
    private double a;
    Rectangle(){
    }
    Rectangle(double a){
        this.a=a;
    }
    public double getX(){
        return a;
    }
    public double Area(){
        return getX()*getX();
    }
}
class Circle implements Shape1{
    private double r;
    Circle(){

    }
    Circle(double r){
        this.r=r;
    }
    public double getR(){
        return r;
    }

    public double Area(){
        return 3.14*getR()*getR();
    }
}
class Star implements Shape1{
    Star(){}
    public double Area(){
        return 0;
    }
    public boolean isStar(){
        if(Area()==0)
            return true;
        else
            return false;
    }
}
class Vector implements Shape1{
    public double Area(){
        return 0;
    }
}
class Test6 {
    public static void main(String args[]){
        Shape1[] s=new Vector[9];//新建对象数组
        int n;
        for(int i=0;i<s.length;i++){
            n=(int)(Math.random()*5);//随机函数产生随机值
            switch(n){
                case 1:s[i]=new Circle();break;//父类引用指向子类对象
                case 2:s[i]=new Rectangle();break;
                case 3:s[i]=new Star();break;
            }
        }
        for(int i=0;i<s.length;i++){
            if(s[i].Area()==0){
                System.out.println(s[i]+"是个Star");
            }
            else System.out.println(s[i].Area());
        }

    }
}