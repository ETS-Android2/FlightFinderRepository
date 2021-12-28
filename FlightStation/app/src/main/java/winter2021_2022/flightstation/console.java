package winter2021_2022.flightstation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class console {

    // Requesting an HTTP Request;
    public static void main(String[] args) {
        // Https Request using java.net.HttpURLConnection
        HttpURLConnection connection;
        BufferedReader reader;
        String Line;
        StringBuilder responseContent = new StringBuilder(); // the type can be StringBuffer;

        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/albums");
            connection = (HttpURLConnection) url.openConnection();

            // Request Setup
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000); //5000 milli seconds
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
//            System.out.println(status);
            parse(responseContent.toString());

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((Line = reader.readLine()) != null) {
                    responseContent.append(Line);
                }
                reader.close();
            }
            else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((Line = reader.readLine()) != null) {
                    responseContent.append(Line);
                }
                reader.close();
            }
            System.out.println(responseContent.toString());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void parse(String responseBody) {
        try {
            JSONArray albumsArray = new JSONArray(responseBody);
            for (int i = 0; i < albumsArray.length(); i ++) {
                JSONObject album = albumsArray.getJSONObject(i);
                int id = album.getInt("id");
                int userId = album.getInt("userId");
                String title = album.getString("title");
                System.out.println(id + " "  + title + " " + userId );
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}











