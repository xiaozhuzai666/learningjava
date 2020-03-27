public class Truck extends Vehicles{
    float load;

    public Truck(String brand, String color,float load) {
        super(brand, color);
        this.load = load;
    }
    public void showTruck(){
        System.out.println("载重:"+load+"吨");
    }
}
