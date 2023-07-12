package fase2;

public class EconomyFlight extends Flight {
    public EconomyFlight(String id) {
        super(id);
    }

    /**
     * Ya no necesito saber de que tipo es el pasajero.
     * Porque estoy en la clase Economy
     *
     * @param passenger pasajero
     * @return
     */
    @Override
    public boolean addPassenger(Passenger passenger) {
        return passengers.add(passenger);
    }

    /**
     * El pasajeroVip si quiere puede entrar al vueloEconomico,
     * pero el pasajeroEconomico el solo puede estar aca.
     * Por eso valido si es vip no lo puedo botar.
     */
    @Override
    public boolean removePassenger(Passenger passenger){
        if(!passenger.isVip()){
            return passengers.remove(passengers);
        }
        return false;
    }
}
