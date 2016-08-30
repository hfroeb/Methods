/**
 * Created by halleyfroeb on 8/29/16.
 * Stores information of an Uber trip
 */
public class Uber {
    String driverName;
    int numberOfPassengers;
    boolean arrived;
    int tripDuration;


    public Uber(String driverName, int numberOfPassengers, boolean arrived, int tripDuration) {
        this.driverName = driverName;
        this.numberOfPassengers = numberOfPassengers;
        this.arrived = arrived;
        this.tripDuration = tripDuration;
    }

    public String getDriverName(String driverName) {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getNumberOfPassengers(int numberOfPassengers) {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean getArrived(boolean arrived) {
        return arrived;
    }

    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }

    public int getTripDuration(int tripDuration) {
        return tripDuration;
    }

    public void setTripDuration(int tripDuration) {
        this.tripDuration = tripDuration;
    }

    public void bonus (){
        if(tripDuration >= 45){
            System.out.println("You've earned a 5 dollar bonus on your next ride!");
        }
    }
}



