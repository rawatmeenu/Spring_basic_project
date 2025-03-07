package withstrategicpattern;

public class SportyVehicle extends Vehicle {

    SportyVehicle(){
        super(new SportsDriveStrategy());
    }
}
