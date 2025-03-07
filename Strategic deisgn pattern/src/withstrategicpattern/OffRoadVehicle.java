package withstrategicpattern;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle()

    {
        super( new SportsDriveStrategy()) ;
    }

}
