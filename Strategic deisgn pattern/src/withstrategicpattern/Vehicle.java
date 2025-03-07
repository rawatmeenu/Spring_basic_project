package withstrategicpattern;

public class Vehicle {

    //will only do like this, if we will do like:  DriveStrategy dobjstrat = new NormalDriveStrategy(); then it will bound the strategy
    //craeted object of an interface.

    DriveStrategy dobjstrat;


    //constructor injection. whatever object will come in obj. then will assign that obj to dobjstrat.
    //e.g. for OFFroadvehicle: this.dobjstarat= sportsdrivetsratgey
    Vehicle(DriveStrategy obj)
    {
        this.dobjstrat= obj;
    }


    //caaling the drive method of dobjstrat object whether it's normaldrivestrategy ir sportsdrivestrategy.
    //call sportsdrivetsratgey,drive()
    public void drive(){
        dobjstrat.drive();

    }
}
