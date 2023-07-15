import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class StubHttpURLConnection extends HttpURLConnection {
    private boolean connected;

    public StubHttpURLConnection(URL url) {
        super(url);
        connected = false;
    }

    @Override
    public void disconnect() {
    }

    @Override
    public boolean usingProxy() {
        return false;
    }

    @Override
    public void connect() {
        if (!connected) {
            connected = true;
        }
    }

    @Override
    public InputStream getInputStream() {
        String response = "Esto funciona";
        return new ByteArrayInputStream(response.getBytes());
    }
}
