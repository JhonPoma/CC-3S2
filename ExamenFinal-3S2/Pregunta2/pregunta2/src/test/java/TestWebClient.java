import org.mortbay.jetty.Server;
import org.mortbay.jetty.handler.AbstractHandler;
import org.mortbay.jetty.handler.ContextHandler;
import org.junit.jupiter.api.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWebClient {

    private static Server server;

    @BeforeAll
    public static void setUp() throws Exception {
        server = new Server(8081);

        ContextHandler root = new ContextHandler("/");
        root.setHandler(new TestGetContentOkHandler());
        server.setHandler(root);
        server.setStopAtShutdown(true);
        server.start();
    }

    @AfterAll
    public static void tearDown() throws Exception {
        server.stop();
    }

    @Test
    public void testGetContentOk() throws Exception {
        WebClient client = new WebClient();
        String expectedContent = "Esto funciona";
        String actualContent = client.getContent(new URL("http://localhost:8081"));

        assertEquals(expectedContent, actualContent);
    }

    private static class TestGetContentOkHandler extends AbstractHandler {
        public void handle(String target, HttpServletRequest request, HttpServletResponse response, int dispatch) throws IOException {
            //response.setContentType("text/html;charset=utf-8");
            response.setStatus(HttpServletResponse.SC_OK);
            OutputStream out = response.getOutputStream();
            out.write("Esto funciona".getBytes());
            out.flush();
        }
    }

}
