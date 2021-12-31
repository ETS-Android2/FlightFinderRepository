package winter2021_2022.flightstation;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.*;


import java.io.*;
import java.util.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.*;
import org.json.simple.parser.*;


public class console {

    // Requesting an HTTP Request;
    public static void main(String[] args) {
        String dataParsed = "";
        try {
            URL url = new URL("https://api.npoint.io/8d8df57b1acc46aeb49d");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                dataParsed += line;
            }
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
//        // Https Request using java.net.HttpURLConnection
//        HttpURLConnection connection;
//        BufferedReader reader;
//        String Line;
//        StringBuilder responseContent = new StringBuilder(); // the type can be StringBuffer;
//
//        try {
//            URL url = new URL("https://jsonplaceholder.typicode.com/users");
//            connection = (HttpURLConnection) url.openConnection();
//
//            // Request Setup
//            connection.setRequestMethod("GET");
//            connection.setConnectTimeout(5000); //5000 milli seconds
//            connection.setReadTimeout(5000);
//
//            int status = connection.getResponseCode();
////            System.out.println(status);
////            System.out.println(responseContent.toString());
//
////            parse(responseContent.toString());
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
////            System.out.println(responseContent.getClass());
////            System.out.println(s);
////            parse(s);
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//
//    public static void parse(String s) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        ExampleClass example = objectMapper.readValue(s, ExampleClass.class);
//
//
//    }

//    public static void parse(String s) {
//        try {
//            Object student = new ObjectMapper().readValue(s, Object.class);
//        } catch (JsonMappingException e) {
//            e.printStackTrace();
//        }
//
//    }


//    public static void parse(String content) {
//        //JSON parser object to parse read file
//
//        JsonArray albums = new JsonArray(Collections.singleton(content));
//
//        for (int i = 0; i < albums.size(); i ++) {
//            System.out.println(albums.get(i).getClass());
//        }
//    }



//    public static void parse(String response) {
//        JSONParser parser = new JSONParser();
//        try {
//            Object obj = parser.parse(response);
//            JSONArray albumsArray = (JSONArray) obj;
//            for (int i = 0; i < albumsArray.; i ++) {
//                JSONObject album = albumsArray.getJSONObject(i);
//                int id = album.getInt("id");
//                int userId = album.getInt("userId");
//                String title = album.getString("title");
//                System.out.println(id + " "  + title + " " + userId );
//            }
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }

//    public static void parse(String response) {
//        JSONObject obj = new JSONObject(json);
//        String pageName = obj.getJSONObject("pageInfo").getString("pageName");
//
//        System.out.println(pageName);
//
//        JSONArray arr = obj.getJSONArray("posts");
//        for (int i = 0; i < arr.length(); i++) {
//            String post_id = arr.getJSONObject(i).getString("post_id");
//            System.out.println(post_id);
//        }
//    }


}