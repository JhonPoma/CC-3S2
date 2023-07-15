import java.net.URL;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.IOException;

public class WebClient {
    private HttpURLConnection connection;
    public void setConnection(HttpURLConnection connection){
        this.connection = connection;
    }

    public String getContent(URL url) {
        StringBuffer content = new StringBuffer();
        try {
            //HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();//ASI PODEMOS LLAMAR AL METODO CONNECT DEL STUB
            InputStream is = connection.getInputStream();
            byte[] buffer = new byte[2048];
            int count;
            while (-1 != (count = is.read(buffer))) {
                content.append(new String(buffer, 0, count));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content.toString();
    }
}
