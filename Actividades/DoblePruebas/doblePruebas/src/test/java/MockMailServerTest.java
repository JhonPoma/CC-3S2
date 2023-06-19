import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)//Indicamos a JUnit que vamos a utilizar la extensión de Mockito para las pruebas.
public class MockMailServerTest {

    @Mock //creo una simulacion de "MailServer"
    private MailServer mailServer;

    @Test
    public void sendsWelcomeEmail(){
        var notificaciones = new UserNotifications(mailServer);
        notificaciones.welcomeNewUser("text@example.com");
        //Mockito.when(mailServer.sendEmail()).thenReturn();

        //Otra forma de verificar es usando verify, verificamos que se llame a nuestra clase simulada.
        verify(mailServer).sendEmail("text@example.com","Bienvenido!","Bienvenido a tu cuenta");
    }

/*  MockMailServer, es una implementación personalizada
    utilizada para simular un servidor de correo electrónico
    en las pruebas.

    El objeto MockMailServer actúa como un sustituto o
    doble de prueba para simular el comportamiento de
    un servidor de correo electrónico real.

    Aunque en este caso no estamos usando explícitamente
    la anotación @Mock de un marco de pruebas como Mockito.
 */
//    @Test
//    public void sendsWelcomeEmail() {
//        var mailServer = new MockMailServer();
//        var notificaciones = new UserNotifications(mailServer);
//        notificaciones.welcomeNewUser("test@example.com");
//        assertThat(mailServer.fueLlamado).isTrue();
//        assertThat(mailServer.actualRecipiente)
//                .isEqualTo("test@example.com");
//        assertThat(mailServer.actualTema)
//                .isEqualTo("Bienvenido!");
//        assertThat(mailServer.actualTexto)
//                .contains("Bienvenido a tu cuenta");
//    }
}
