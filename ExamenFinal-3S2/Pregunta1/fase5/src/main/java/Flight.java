import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public abstract class Flight {

    private String id;
    //private String flightType;
    //public List<Passenger> passengers = new ArrayList<Passenger>();
    //Conjunto de pasajeros
    Set<Passenger> passengers = new HashSet<>();

    public Flight(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Set<Passenger> getPassengersSet() {
        return Collections.unmodifiableSet(passengers);
    }

//    public String getFlightType() {
//        return flightType;
//    }

    public abstract boolean addPassenger(Passenger passenger);

    public abstract boolean removePassenger(Passenger passenger);



}
