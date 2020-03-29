package DifferentWay;
//使用继承的方法实现
public class Animal{
    private void beat(){
        System.out.println("动物有心跳！");
    }
    public void breath(){
        beat();
        System.out.println("动物有心跳！");
        }
    }
    class Bird extends Animal{
        public void fly(){
            System.out.println("鸟在飞翔！");
        }
    }
    class Wolf extends Animal{
        public void run(){
            System.out.println("狼在跑！");
        }
    }
    class InheritTest{
    public static void main(String[] args){
        Bird b=new Bird();
        b.breath();
        b.fly();
        Wolf w=new Wolf();
        w.breath();
        w.run();
}
}
