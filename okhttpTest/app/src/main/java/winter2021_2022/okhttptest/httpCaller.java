package winter2021_2022.okhttptest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class httpCaller {
    private static String numberOfBOOKing;

    public String getNumberOfBOOKing() {
        return this.numberOfBOOKing;
    }

    public void changeURLData() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://test.api.amadeus.com/v2/shopping/flight-offers?originLocationCode=SYD&destinationLocationCode=BKK&departureDate=2022-02-01&returnDate=2022-03-18&adults=2&max=5")
                .addHeader("Authorization", "Bearer " + "dCDngvsITGd36p4vZlEqArp63Vwt")
                .method("GET", null)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    final String myResponse = response.body().string();
                    httpCaller.numberOfBOOKing = myResponse;
//                    try {
//                        JSONObject jsonObject = new JSONObject(myResponse);
//                        JSONArray data = jsonObject.getJSONArray("data");
//                        JSONObject js1 = data.getJSONObject(0);
//                        httpCaller.numberOfBOOKing = js1.getString("numberOfBookableSeats");
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        });
    }
}
