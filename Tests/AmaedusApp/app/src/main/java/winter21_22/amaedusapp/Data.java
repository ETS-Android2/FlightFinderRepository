package winter21_22.amaedusapp;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Data {
    String dateString;


    public Data() {

    }

    public void getData() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://test.api.amadeus.com/v2/shopping/flight-offers?originLocationCode=SYD&destinationLocationCode=BKK&departureDate=2022-02-01&returnDate=2022-02-18&adults=2&max=5")
                .addHeader("Authorization", "Bearer " + "YBF24aRIq6xnUiyf9k0SAGVdo9aR")
                .method("GET", null)
                .build();
        try {
            Response response = client.newCall(request).execute();
            this.dateString = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDateString() {
        return dateString;
    }

    public String getName() {
        return "HI how are you doing";
    }
}
