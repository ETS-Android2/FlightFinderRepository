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

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class ExampleClass {
    // Requesting an HTTP Request;
    public static void main(String[] args) {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://test.api.amadeus.com/v2/shopping/flight-offers?originLocationCode=SYD&destinationLocationCode=BKK&departureDate=2022-02-01&returnDate=2022-03-18&adults=2&max=5")
                .addHeader("Authorization", "Bearer " + "hjMOKA7DS68jo9NAE7MzsCQmXPmN")
                .method("GET", null)
                .build();

//                OkHttpClient client = new OkHttpClient().newBuilder()
//                .build();
//                Request request = new Request.Builder()
//                .url("https://api.npoint.io/8d8df57b1acc46aeb49d")
//                .method("GET", null)
//                .build();

            try {
                Response response = client.newCall(request).execute();

                String responseString = response.body().string();
                System.out.println(responseString);
//                try {
//                    JSONObject jsonObject = new JSONObject(responseString);
//                    System.out.println(jsonObject.toString());
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }

            } catch (IOException e) {
                e.printStackTrace();
            }

//        // Https Request using java.net.HttpURLConnection
//        HttpURLConnection connection;
//        BufferedReader reader;
//        String Line;
//        StringBuilder responseContent = new StringBuilder(); // the type can be StringBuffer;
//
//        try {
//            URL url = new URL("https://test.api.amadeus.com/v1/shopping/flight-destinations?origin=PAR&maxPrice=200' -H 'Authorization: Bearer {{token}}");
//    // 61d3809713b15b74ee7b9a07
////            URL url = new URL("https://jsonplaceholder.typicode.com/users");
//            connection = (HttpURLConnection) url.openConnection();
//
//            // Request Setup
//            connection.setRequestMethod("GET");
//            connection.setConnectTimeout(5000); //5000 milli seconds
//            connection.setReadTimeout(5000);
//
//            int status = connection.getResponseCode();
//
//            if (status > 299) {
//                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
//                while ((Line = reader.readLine()) != null) {
//                    responseContent.append(Line);
//                }
//                reader.close();
//            }
//            else {
//                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                while ((Line = reader.readLine()) != null) {
//                    responseContent.append(Line);
//                }
//                reader.close();
//            }
//
//            String s = responseContent.toString();
////            System.out.println(s.getClass());
//            System.out.println(s);
////            parse(s);
//
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }
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
