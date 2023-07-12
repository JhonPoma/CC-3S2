package fase2;

public class BussinesFlight extends Flight{
    public BussinesFlight(String id){
        super(id);
    }

    /**
     * Valido si el pasajero es Vip, para poder agregarle
     * @param passenger pasajero.
     * @return
     */
    @Override
    public boolean addPassenger(Passenger passenger){
        if(passenger.isVip()){
            return passengers.add(passenger);
        }
        return false;
    }

    /**
     * No lo puedo retiral del viajeEjecutivo porque el pasajero es vip.
     */
    @Override
    public boolean removePassenger(Passenger passenger){
        return false;
    }

}
