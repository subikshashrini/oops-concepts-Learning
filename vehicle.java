public class vehicle {
    int make;
    String model;
    public vehicle(int make,String model) {
        this.make = make;
        this.model = model;
    }
}
class electriccar extends vehicle{

    private int battery_status;
    public electriccar(int make,String model){
        super(make,model);
        //this.battery_status=battery_status;
    }
    public int getbattery(){
        return battery_status;
    }
    public void setbattery(int battery_status){
        this.battery_status=battery_status;
    }

    public static void main(String[] args) {
        vehicle car1 = new electriccar(2002,"Toyato");
        ((electriccar)car1).setbattery(100);
        System.out.println(((electriccar)car1).getbattery());

    }


}
