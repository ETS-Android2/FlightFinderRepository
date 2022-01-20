package winter21_22.sampledataparse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ComputeParse {
    private String dataParsed;

    public void readURLData() {
        try {
            URL url = new URL("https://api.npoint.io/8d8df57b1acc46aeb49d");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                this.dataParsed += line;
            }
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDataParsed() {
        return this.dataParsed;
    }

    public void jsonParse() {

    }
}
