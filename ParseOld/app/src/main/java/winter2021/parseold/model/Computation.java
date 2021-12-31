package winter2021.parseold.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Computation {

    String parsedNames;

    public String parse() {
        String data = "";

        try {
            URL url = new URL("https://api.npoint.io/8d8df57b1acc46aeb49d");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                data += line;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }


    public void parseMore(String s) {
        try {
            JSONObject jsonObject = new JSONObject(s);
            JSONArray users = jsonObject.getJSONArray("Users");
            for (int i = 0; i < users.length(); i ++) {
                JSONObject names = users.getJSONObject(i);
                String name = names.getString("name");
                this.parsedNames += name + "\n";
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
