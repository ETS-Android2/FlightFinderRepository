package winter2021_2022.flightstation;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;

public class ExampleClass {
    // Requesting an HTTP Request;
    public static void main(String[] args) {
        // Https Request using java.net.HttpURLConnection
        HttpURLConnection connection;
        BufferedReader reader;
        String Line;
        StringBuilder responseContent = new StringBuilder(); // the type can be StringBuffer;

        try {
            URL url = new URL("https://api.flightapi.io/airline/61d3809713b15b74ee7b9a07?num=113&name=BA&date=20201223");

//            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            connection = (HttpURLConnection) url.openConnection();

            // Request Setup
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000); //5000 milli seconds
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

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

            String s = responseContent.toString();
//            System.out.println(s.getClass());
            System.out.println(s);
//            parse(s);


        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void parse(String s) {
        try {
            JSONObject jsonObject = new JSONObject(s);
//            JSONArray jsonArray = jsonObject.getJSONArray("data");
            System.out.println(jsonObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
