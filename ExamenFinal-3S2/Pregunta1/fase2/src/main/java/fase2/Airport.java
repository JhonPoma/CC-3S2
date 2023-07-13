package fase2;

import fase2.Flight;
import fase2.Passenger;

public class Airport {

    public static void main(String[] args) {
        //Creo los dos 2 objetos, le paso el id y ya no el tipo porque ambas clases estan separadas.
        Flight economyFlight = new EconomyFlight("1");
        Flight businessFlight = new BussinesFlight("2");

        Passenger checha = new Passenger("Checha", true);
        Passenger lore = new Passenger("Lore", false);


        businessFlight.addPassenger(checha);
        //businessFlight.removePassenger(checha);
        businessFlight.addPassenger(lore);
        //economyFlight.addPassenger(lore);

        System.out.println(" Lista de pasajeros de vuelos de negocios:");
        for (Passenger passenger : businessFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }

        System.out.println(" Lista de pasajeros de vuelos economicos:");
        for (Passenger passenger : economyFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }
    }
}