public class Test2 {
    public static void main(String[] args) {
            Vehicles v = new Vehicles("汽车","黑色");
            v.showlnfo();


            Car c = new Car("奥迪","黑色",5);
            c.showlnfo();
            c.showCar();

            Truck t = new Truck("一汽","白色",6);
            t.showlnfo();
            t.showTruck();
    }
}
