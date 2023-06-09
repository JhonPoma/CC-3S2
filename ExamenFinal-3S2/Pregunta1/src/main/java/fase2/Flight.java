package fase2;

import fase2.Passenger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Flight {

    private String id;
    public List<Passenger> passengers = new ArrayList<Passenger>();
    //private String flightType;

    public Flight(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengers);
    }

//    public String getFlightType() {
//        return flightType;
//    }

    public boolean addPassenger(Passenger passenger) {
    }

    public boolean removePassenger(Passenger passenger) {
    }


}
