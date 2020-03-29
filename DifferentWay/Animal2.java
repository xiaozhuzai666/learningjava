package DifferentWay;
//以组合方式实现
    class Animal2{
        private void beat(){
            System.out.println("动物有心跳");
        }
        public void breath(){
            beat();
            System.out.println("动物会呼吸");
        }
    }
    class Bird1{
        private Animal2 a;
        public Bird1(Animal2 a){
            this.a=a;
        }
        public void breath(){
            a.breath();
        }
        public void fly(){
            System.out.println("鸟在飞翔");
        }
    }
    class Wolf1{
        private Animal2 a;
        public Wolf1(Animal2 a){
            this.a=a;
        }
        public void breath(){
            a.breath();
        }
        public void run(){
            System.out.println("狼在跑");
        }
    }
     class CompositeTest{
        public static void main(String[] args){
            Animal2 a1=new Animal2();
            Bird1 b=new Bird1(a1);
            b.breath();
            b.fly();
            Animal2 a2=new Animal2();
            Wolf1 w=new Wolf1(a2);
            w.breath();
            w.run();
}}
