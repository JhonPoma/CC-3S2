public class PremiumFlight extends Flight {
    public PremiumFlight(String id){
        super(id);
    }

    /**
     * Politicas:
     * Si el pasajero es Vip, se puede agregar al vueloPremium
     * @param passenger pasajero
     * @return true si es vip, false si es regular.
     */
    @Override
    public boolean addPassenger(Passenger passenger) {
        if(passenger.isVip()){
            return passengers.add(passenger);
        }
        return false;
    }

    /**
     *  Si se requiere, un pasajero puede ser eliminado de un vuelo
     * @param passenger pasajero
     * @return true
     */
    @Override
    public boolean removePassenger(Passenger passenger){
        return passengers.remove(passenger);
    }
}
