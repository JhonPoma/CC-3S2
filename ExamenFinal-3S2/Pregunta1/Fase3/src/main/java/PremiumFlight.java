import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PremiumFlight{
    private String id;
    private List<Passenger> passengers = new ArrayList<Passenger>();

    public PremiumFlight(String id){
        this.id = id;
    }
    public List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengers);
    }

    /**
     * Politicas:
     * Si el pasajero es Vip, se puede agregar al vueloPremium
     * @param passenger pasajero
     * @return true si es vip, false si es regular.
     */
    public boolean addPassenger(Passenger passenger) {
        if(passenger.isVip()){
            return passengers.add(passenger);
        }
        return false;
    }

    /**
     * Si se requiere, un pasajero puede ser eliminado de un vuelo
     * @param passenger pasajero
     * @return true
     */
    public boolean removePassenger(Passenger passenger){
        return passengers.remove(passenger);
    }
}
