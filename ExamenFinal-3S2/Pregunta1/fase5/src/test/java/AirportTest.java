//completa

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class AirportTest {

    //=======================================================
    @DisplayName("Vuelo Economico")
    @Nested
    class EconomyFlightTest {

        private Flight economyFlight;
        private Passenger checha;
        private Passenger lore;

        @BeforeEach
        void setUp() {
            economyFlight = new EconomyFlight("1");
            checha = new Passenger("Checha", false);
            lore = new Passenger("Lore", true);
        }

        @Nested
        @DisplayName("Cuando tenemos un pasajero REGULAR")
        class RegularPassenger {
            @Test
            @DisplayName("Podemos agregarlo y eliminarlo de un vuelo economico")
            public void testEconomyFlightRegularPassenger() {
                assertAll("Verifica todas las condiciones para un pasajero regular y un vuelo economico",
                        () -> assertEquals("1", economyFlight.getId()),
                        () -> assertEquals(true, economyFlight.addPassenger(checha)),
                        () -> assertEquals(1, economyFlight.getPassengersSet().size()),
                        () -> assertEquals("Checha", new ArrayList<>(economyFlight.getPassengersSet()).get(0).getName()),
                        () -> assertEquals(true, economyFlight.removePassenger(checha)),
                        () -> assertEquals(0, economyFlight.getPassengersSet().size())
                );
            }
            @RepeatedTest(2)//Repito 2
            @DisplayName("No se puede registrar dos veces en un mismo vuelo")
            public void testVueloEconomicoPasajeroRegularAgregarUnaSolaVez(RepetitionInfo repetitionInfo){
                    for(int i = 0; i<repetitionInfo.getCurrentRepetition(); i++){
                        economyFlight.addPassenger(checha);// Agrego 2 veces al pasajero checha, pero solo se guardara 1 vez
                    }
                    assertAll("Verifica que un pasajero REGULAR se pueda agregar a un vuelo económico solo una vez",
                            () -> assertEquals(1, economyFlight.getPassengersSet().size()),
                            () -> assertTrue(economyFlight.getPassengersSet().contains(checha))
                    );
                }
            }


        @Nested
        @DisplayName("Cuando tenemos un pasajero VIP")
        class VipPassenger {
            @Test
            @DisplayName("Puedo agregarlo pero no puedo eliminarlo de un vuelo economico")
            public void testEconomyFlightVipPassenger() {
                assertAll("Verifica todas las condiciones para un pasajero VIP y un vuelo economico",
                        () -> assertEquals("1", economyFlight.getId()),
                        () -> assertEquals(true, economyFlight.addPassenger(lore)),
                        () -> assertEquals(1, economyFlight.getPassengersSet().size()),
                        () -> assertEquals("Lore", new ArrayList<>(economyFlight.getPassengersSet()).get(0).getName()),
                        () -> assertEquals(false, economyFlight.removePassenger(lore)),
                        () -> assertEquals(1, economyFlight.getPassengersSet().size())
                );
            }
            @RepeatedTest(2)
            @DisplayName("No puedo agregarlo a un vuelo economico mas de una vez")
            public void testVueloEconomicoPasajeroVipAgregarUnaSolaVez(RepetitionInfo repetitionInfo){
                for(int i = 0; i<repetitionInfo.getCurrentRepetition(); i++){
                    economyFlight.addPassenger(lore);
                }
                assertAll("Verificamos que un pasajero VIP se agrego a un vuelo económico solo una vez",
                        () -> assertEquals(1, economyFlight.getPassengersSet().size()),
                        () -> assertTrue(economyFlight.getPassengersSet().contains(lore))
                );
            }
        }
    }


    //=======================================================
    @DisplayName("Vuelo de Negocios")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;
        private Passenger checha;
        private Passenger lore;

        @BeforeEach
        void setUp() {
            businessFlight = new BusinessFlight("2");
            checha = new Passenger("Checha", false);
            lore = new Passenger("Lore", true);
        }

        @Nested
        @DisplayName("Cuando tenemos un pasajero REGULAR")
        class RegularPassenger {
            @Test
            @DisplayName("Entonces no puedes agregarlo o eliminarlo de un vuelo de negocios")
            public void testBusinessFlightRegularPassenger() {
                assertAll("Verifica todas las condiciones para un pasajero regular y un vuelo de negocios",
                        () -> assertEquals(false, businessFlight.addPassenger(checha)),
                        () -> assertEquals(0, businessFlight.getPassengersSet().size()),
                        () -> assertEquals(false, businessFlight.removePassenger(checha)),
                        () -> assertEquals(0, businessFlight.getPassengersSet().size())
                );
            }
        }

        @Nested
        @DisplayName("Cuando tenemos un pasajero VIP")
        class VipPassenger {
            @Test
            @DisplayName("Podemos agregarlo pero no podemos eliminarlo de un vuelo de negocios")
            public void testBusinessFlightVipPassenger() {
                assertAll("Verifica todas las condiciones para un pasajero VIP y un vuelo de negocios",
                        () -> assertEquals(true, businessFlight.addPassenger(lore)),
                        () -> assertEquals(1, businessFlight.getPassengersSet().size()),
                        () -> assertEquals(false, businessFlight.removePassenger(lore)),
                        () -> assertEquals(1, businessFlight.getPassengersSet().size())
                );
            }

            @RepeatedTest(2)
            @DisplayName("No puedo agregarlo a un vuelo economico mas de una vez")
            public void testVueloNegocioPasajeroVipAgregarUnaSolaVez(RepetitionInfo repetitionInfo){
                for(int i = 0; i<repetitionInfo.getCurrentRepetition(); i++){
                    businessFlight.addPassenger(lore);
                }
                assertAll("Verificamos que un pasajero VIP se agrego a un vuelo Negocio solo una vez",
                        () -> assertEquals(1, businessFlight.getPassengersSet().size()),
                        () -> assertTrue(businessFlight.getPassengersSet().contains(lore))
                );
            }
        }
    }


    //=======================================================
    @DisplayName("Vuelo Premium")
    @Nested
    class PremiumFlightTest {
        private Flight premiumFlight;
        private Passenger checha;
        private Passenger lore;

        @BeforeEach
        void setUp() {
            premiumFlight = new PremiumFlight("3");
            checha = new Passenger("Checha", false);
            lore = new Passenger("Lore", true);
        }

        @Nested
        @DisplayName("Cuando tenemos un pasajero REGULAR")
        class RegularPassenger {

            @Test
            @DisplayName("Entonces no puedo agregarlo o eliminarlo de un vuelo Premium")
            public void testBusinessFlightRegularPassenger() {
                assertAll("Verifica todas las condiciones para un pasajero regular y un vueloPremium",
                        () -> assertEquals(false, premiumFlight.addPassenger(checha)),
                        () -> assertEquals(0, premiumFlight.getPassengersSet().size()),
                        () -> assertEquals(false, premiumFlight.removePassenger(checha)),
                        () -> assertEquals(0, premiumFlight.getPassengersSet().size())
                );
            }
        }

        @Nested
        @DisplayName("Cuando tenemos un pasajero VIP")
        class VipPassenger {

            @Test
            @DisplayName("Luego puedes agregarlo tambien se puede eliminarlo de un vuelo de Premium")
            public void testBusinessFlightVipPassenger() {
                assertAll("Verifica todas las condiciones para un pasajero VIP y un vuelo de Premium",
                        () -> assertEquals(true, premiumFlight.addPassenger(lore)),
                        () -> assertEquals(1, premiumFlight.getPassengersSet().size()),
                        () -> assertEquals(true, premiumFlight.removePassenger(lore)),
                        () -> assertEquals(0, premiumFlight.getPassengersSet().size())
                );
            }
            @RepeatedTest(2)//Repito 2
            @DisplayName("No se puede registrar dos veces en un mismo vuelo")
            public void testVueloPremiumPasajeroRegularAgregarUnaSolaVez(RepetitionInfo repetitionInfo){
                for(int i = 0; i<repetitionInfo.getCurrentRepetition(); i++){
                    premiumFlight.addPassenger(lore);// Agrego 2 veces al pasajero lore, pero solo se guardara 1 vez
                }
                assertAll("Verifica que un pasajero VIP se pueda agregar a un vuelo Premium solo una vez",
                        () -> assertEquals(1, premiumFlight.getPassengersSet().size()),
                        () -> assertTrue(premiumFlight.getPassengersSet().contains(lore))
                );
            }
        }
    }



}
