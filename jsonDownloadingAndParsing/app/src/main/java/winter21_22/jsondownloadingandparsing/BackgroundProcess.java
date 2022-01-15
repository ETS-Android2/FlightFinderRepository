package winter21_22.jsondownloadingandparsing;

import android.util.Log;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class BackgroundProcess implements Runnable {

    //        String url;

        String result;

        public BackgroundProcess() {
            this.result = "";
            run();
        }

        public String getResult() {
            return this.result;
        }

        @Override
        public void run() {
//            OkHttpClient client = new OkHttpClient().newBuilder()
//                    .build();
//            Request request = new Request.Builder()
//                    .url("https://test.api.amadeus.com/v2/shopping/flight-offers?originLocationCode=SYD&destinationLocationCode=BKK&departureDate=2022-02-01&returnDate=2022-03-18&adults=2&max=5")
//                    .addHeader("Authorization", "Bearer " + "nGfTxZqjzsPtSg4Gp0L8eXUgFS1E")
//                    .method("GET", null)
//                    .build();

                OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
                Request request = new Request.Builder()
                .url("https://api.npoint.io/8d8df57b1acc46aeb49d")
                .method("GET", null)
                .build();

            try {
                Response response = client.newCall(request).execute();
                this.result = response.body().string();
                Log.e("Json", this.result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
