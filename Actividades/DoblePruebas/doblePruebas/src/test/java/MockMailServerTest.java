import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MockMailServerTest {
    @Test
    public void sendsWelcomeEmail() {
        var mailServer = new MockMailServer();
        var notificaciones = new UserNotifications(mailServer);
        notificaciones.welcomeNewUser();
        assertThat(mailServer.fueLlamado).isTrue();
        assertThat(mailServer.actualRecipiente)
                .isEqualTo("test@example.com");
        assertThat(mailServer.actualTema)
                .isEqualTo("Bienvenido!");
        assertThat(mailServer.actualTexto)
                .contains("Bienvenido a tu cuenta");
    }
}
