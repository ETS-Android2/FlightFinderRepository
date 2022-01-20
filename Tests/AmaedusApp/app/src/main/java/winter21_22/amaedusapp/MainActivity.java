package winter21_22.amaedusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new Data();
    }

    class jsonTask extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... param) {
            Response response = null;

            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            Request request = new Request.Builder()
                    .url("https://test.api.amadeus.com/v2/shopping/flight-offers?originLocationCode=SYD&destinationLocationCode=BKK&departureDate=2022-02-01&returnDate=2022-03-18&adults=2&max=5")
                    .addHeader("Authorization", "Bearer " + "hjMOKA7DS68jo9NAE7MzsCQmXPmN")
                    .method("GET", null)
                    .build();
            try {
                 response = client.newCall(request).execute();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return response.body().toString();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            setContentsOfTextView(R.id.labelOutput, s);
        }
    }

    public void buttonAddaNewAccount(View view) {

        setContentsOfTextView(R.id.labelOutput, data.getName());
    }

    public void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }
}














