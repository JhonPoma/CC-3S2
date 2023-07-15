import java.net.*;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWebClientInicial{
    private WebClient webClient;
    private StubHttpURLConnection stubConnection;

    /**
     * Nos perrmitira utilizar un controlador de flujo de URL personalizado
     * en lugar del controlador predeterminado al abrir una conexión HTTP.
     */
    @BeforeAll
    public static void setUpClass() {
        URL.setURLStreamHandlerFactory(new StubURLStreamHandlerFactory());
    }

    /**
     * Utilizaremos el stub StubHttpURLConnection en lugar de una conexión real.
     * La instancia de WebClient se debe conectar con el stub.
     * @throws Exception
     */
    @BeforeEach
    public void setUp() throws Exception {
        webClient = new WebClient();
        stubConnection = new StubHttpURLConnection(new URL("http://localhost:8081"));
        webClient.setConnection(stubConnection); //STUB
    }
    @AfterAll
    public static void tearDown() {
        // Se detiene Jetty.
    }

    @Test
    @Disabled(value = "Esto es un ejemplo de prueba inicial . Por tanto si se ejecuta no funciona.")
    public void testGetContentOk() throws MalformedURLException {
        WebClient client = new WebClient();
        String workingContent = client.getContent(new URL("http://localhost:8081/testGetContentOk"));
        assertEquals("Esto funciona", workingContent);
    }

    /**
     * En esta prueba corroboramos que WebClient esté funcionando
     * correctamente con el stub y pueda obtener el resultado esperado.
     * @throws Exception
     */
    @Test
    public void testStubGetContentOk() throws Exception {
        String expectedContent = "Esto funciona";
        stubConnection.getInputStream();
        String actualContent = webClient.getContent(new URL("http://localhost:8081/testGetContentOk"));
        System.out.println(actualContent);
        assertEquals(expectedContent, actualContent);
    }



}


