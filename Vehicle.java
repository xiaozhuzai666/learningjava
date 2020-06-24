abstract class Vehicle {
    public abstract void NoOfWheels ();
}
class Car1 extends Vehicle {
    public void NoOfWheels() {
        System.out.println("4轮的车,有方向盘");
    }
}
class Motorbike extends Vehicle {
    public void NoOfWheels() {
        System.out.println("双轮的车，无方向盘");
    }
}

class Ces {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Car1 c = new Car1();
        c.NoOfWheels();
        Motorbike m = new Motorbike();
        m.NoOfWheels();
    }
}



