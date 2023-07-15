import java.net.*;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWebClientInicial{
    private WebClient webClient;
    private StubHttpURLConnection stubConnection;

    @BeforeAll
    public static void setUpClass() {
        URL.setURLStreamHandlerFactory(new StubURLStreamHandlerFactory());
    }
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

    @Test
    public void testStubGetContentOk() throws Exception {
        String expectedContent = "Esto funciona";
        stubConnection.getInputStream();
        String actualContent = webClient.getContent(new URL("http://localhost:8081/testGetContentOk"));
        assertEquals(expectedContent, actualContent);
    }


    private static class StubURLStreamHandlerFactory implements URLStreamHandlerFactory {
        @Override
        public URLStreamHandler createURLStreamHandler(String protocol) {
            if ("http".equals(protocol)) {
                return new StubHttpURLStreamHandler();
            }
            return null;
        }

        private static class StubHttpURLStreamHandler extends URLStreamHandler {
            @Override
            protected URLConnection openConnection(URL url) {
                return new StubHttpURLConnection(url);
            }
        }
    }
}


