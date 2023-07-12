package fase1;

import fase1.Flight;
import fase1.Passenger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AirportTest {
    private Flight economyFlight;
    private Flight businessFlight;
    private Passenger checha;
    private Passenger lore;

    @BeforeEach
    public void setUp() {
        economyFlight = new Flight("1", "Economico");
        businessFlight = new Flight("2", "Negocios");
        checha = new Passenger("Checha", true);
        lore = new Passenger("Lore", false);

    }

    @Test
    public void pruebaAgregarPasajeroAlVueloDeNegocios() {
        boolean añadir = businessFlight.addPassenger(checha);
        Assertions.assertTrue(añadir);
    }

    @Test
    public void pruebaEliminarPasajeroDelVueloNegocios() {
        businessFlight.addPassenger(checha);
        boolean eliminar = businessFlight.removePassenger(checha);
        Assertions.assertTrue(eliminar);
    }

    @Test
    public void pruebaAgregarPasajeroAlVueloEconomico() {
        boolean añadir = economyFlight.addPassenger(lore);

        Assertions.assertTrue(añadir);
    }

    @Test
    public void pruebaEliminarPasajeroDelVueloEconomico() {
        economyFlight.addPassenger(lore);
        boolean eliminar = economyFlight.removePassenger(lore);
        Assertions.assertTrue(eliminar);
    }
}
