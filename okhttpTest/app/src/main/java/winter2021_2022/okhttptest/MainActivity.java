package winter2021_2022.okhttptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://test.api.amadeus.com/v2/shopping/flight-offers?originLocationCode=SYD&destinationLocationCode=BKK&departureDate=2022-02-01&returnDate=2022-03-18&adults=2&max=5")
                .addHeader("Authorization", "Bearer " + "z8bDAqIGxng59Md4nb5NoeO7RfCd")
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
                    setContentsOfTextView(R.id.labelOutput, "1:" + myResponse);
//                    try {
//                        JSONObject jsonObject = new JSONObject(myResponse);
//                        JSONArray data = jsonObject.getJSONArray("data");
//                        JSONObject js1 = data.getJSONObject(0);
//                        String numberOfBookableSeats = js1.getString("numberOfBookableSeats");
//                        setContentsOfTextView(R.id.labelOutput, "1:" + numberOfBookableSeats);
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        });

    }

    public void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }
}


























