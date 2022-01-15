package winter21_22.jsondownloadingandparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    static int counter = 0;

    static String newResult = "";

    String nobS = "";

//        String url = "https://jsonplaceholder.typicode.com/users";
//    String url = "http://api.aviationstack.com/v1/flights?access_key=a040cf28d6f8b0e66f379a3f82fad839\n";
//     String url = "http://api.aviationstack.com/v1/flights?access_key=a040cf28d6f8b0e66f379a3f82fad839";
//    String url = "https://api.flightapi.io/iata/61d3809713b15b74ee7b9a07/new%20york/airport"; // flightapi.io
//    String url = "https://api.npoint.io/1192ddce993fbd4bbc7e";
    String url = "https://api.npoint.io/8d8df57b1acc46aeb49d";
//    String url = "https://api.npoint.io/8d8df57b1acc46aeb49d";

//    String url = "https://api.flightapi.io/iata/61d3809713b15b74ee7b9a07/new%20york/airport";
//    String url = "https://test.api.amadeus.com/v1/shopping/flight-destinations?origin=PAR&maxPrice=200' -H 'Authorization: Bearer cCAE1JbD5ePyeOjgBDSvvTidLrCu";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




//        DataUsers dataUsers = new DataUsers();
//        dataUsers.getDataFromUrl();
//        String firstName = dataUsers.getFirstName();
//
//        setContentsOfTextView(R.id.text, firstName);

//        new jsonTask().execute();
//        setContentsOfTextView(R.id.text, newResult);

    }

    class jsonTask extends AsyncTask<String, String, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... param) {
            String tempResult = "";

//            OkHttpClient client = new OkHttpClient().newBuilder()
//            .build();
//            Request request = new Request.Builder()
//            .url("https://test.api.amadeus.com/v2/shopping/flight-offers?originLocationCode=SYD&destinationLocationCode=BKK&departureDate=2022-02-01&returnDate=2022-03-18&adults=2&max=5")
//            .addHeader("Authorization", "Bearer " + "nGfTxZqjzsPtSg4Gp0L8eXUgFS1E")
//            .method("GET", null)
//            .build();

                OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
                Request request = new Request.Builder()
                .url("https://api.npoint.io/8d8df57b1acc46aeb49d")
                .method("GET", null)
                .build();

            try {
                Response response = client.newCall(request).execute();

                newResult = response.body().string();
                Log.e("Json", tempResult);
            } catch (IOException e) {
                e.printStackTrace();
            }
        return tempResult;
//            try {
//                URL myurl = new URL(url);
//                HttpURLConnection urlConnection = (HttpURLConnection) myurl.openConnection();
//                urlConnection.setRequestMethod("GET");
//                urlConnection.setConnectTimeout(5000); //5000 milli seconds
//                urlConnection.setReadTimeout(5000);
//
//
//                InputStreamReader streamReader = new InputStreamReader(urlConnection.getInputStream());
//                BufferedReader reader = new BufferedReader(streamReader);
//                StringBuilder builder = new StringBuilder();
//                String line;
//
//                while ((line = reader.readLine()) != null) {
//                    builder.append(line);
//                }
//
//                tempResult = builder.toString();
//                Log.e("Json", tempResult);
//                reader.close();
//
////                Log.e("Json", result);
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return tempResult;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

//            try {
//                JSONObject jsonObject = new JSONObject(s);
//                JSONArray data = jsonObject.getJSONArray("data");
//                JSONObject js1 = data.getJSONObject(0);
//                String numberOfBookableSeats = js1.getString("numberOfBookableSeats");
////                setContentsOfTextView(R.id.text, "1:" + numberOfBookableSeats);
//
//                nobS = numberOfBookableSeats;
////                JSONObject meta = jsonObject.getJSONObject("meta");
////                String count = meta.getString("count");
////                setContentsOfTextView(R.id.text, "1:" + count);
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }


//            try {
//                JSONObject jsonObject = new JSONObject(s);
//                JSONArray jsonArray = jsonObject.getJSONArray("Users");
//                JSONObject firstUser = jsonArray.getJSONObject(0);
//                String name = firstUser.getString("name");
//                setContentsOfTextView(R.id.text, "1:" + name);
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }


//            if (counter == 0) {
//                setResult(s);
//            }
//            else {
//                setResult2(s);
//            }
//            counter ++;
//            if (counter == 0) {
//                setResult(s);
//            }
//            else {
//                setResult2(s);
//            }
//            counter ++;

//            String names = "";
//            try {
//                JSONObject jsonObject = new JSONObject(s);
//                JSONArray dataArray = jsonObject.getJSONArray("data");
//                JSONObject airportCode = dataArray.getJSONObject(0);
//                String name = airportCode.getString("name");
//                setContentsOfTextView(R.id.text, name);
//
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }

//            setContentsOfTextView(R.id.text, s);

//            try {
//                JSONObject jsO = new JSONObject(s);
//                JSONArray jsPagination = jsO.getJSONArray("data");
//                JSONObject object = jsPagination.getJSONObject(0);

//                JSONObject js0 = new JSONObject(s);
//                JSONArray jsPagination = js0.getJSONArray("data");
//                JSONObject flight = jsPagination.getJSONObject(0);

//                JSONArray jsonArray = js0.getJSONArray("pagination");
//                JSONObject js1 = jsonArray.getJSONObject(0);

//                JSONArray jsonArray = new JSONArray(s);
//                JSONObject jsonObject = jsonArray.getJSONObject(0);

//                JSONObject jsonObject = new JSONObject(s);
//                setContentsOfTextView(R.id.text, s.toString());


//                JSONObject jsonObject = new JSONObject(s);
//                JSONArray jsonArray = jsonObject.getJSONArray("data");
//                setContentsOfTextView(R.id.text, jsonArray.getJSONObject(0).toString());

//                JSONArray jsonArray = new JSONArray(s);
//                for (int i = 0; i < jsonArray.length(); i++) {
//                    JSONObject object = jsonArray.getJSONObject(i);
//                    names += object.getString("name") + "\n";
//                }
//            }
//            catch (JSONException e) {
//                e.printStackTrace();
//            }
//            setContentsOfTextView(R.id.text, names);
//        }
//    }
        }
    }

//    class getDataFromUrl implements Runnable {
//        String url;
//
//        String result;
//
//        public getDataFromUrl() {
//            this.result = "";
//        }
//
//        public String getResult() {
//            return this.result;
//        }
//
//        @Override
//        public void run() {
////            OkHttpClient client = new OkHttpClient().newBuilder()
////                    .build();
////            Request request = new Request.Builder()
////                    .url("https://test.api.amadeus.com/v2/shopping/flight-offers?originLocationCode=SYD&destinationLocationCode=BKK&departureDate=2022-02-01&returnDate=2022-03-18&adults=2&max=5")
////                    .addHeader("Authorization", "Bearer " + "nGfTxZqjzsPtSg4Gp0L8eXUgFS1E")
////                    .method("GET", null)
////                    .build();
//
//                OkHttpClient client = new OkHttpClient().newBuilder()
//                .build();
//                Request request = new Request.Builder()
//                .url("https://api.npoint.io/8d8df57b1acc46aeb49d")
//                .method("GET", null)
//                .build();
//
//            try {
//                Response response = client.newCall(request).execute();
//                this.result = response.body().string();
//                Log.e("Json", this.result);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    class getDataFromUrl extends Thread {

        String url;

        String result;

        String name;

        public void setN(String name) {
            this.name = name;
        }

        public String getN() {
            return this.name;
        }

        public getDataFromUrl() {
            this.result = "";
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

                    try {
                    JSONObject jsonObject = new JSONObject(this.result);
                    JSONArray jsonArray = jsonObject.getJSONArray("Users");
                    JSONObject firstUser = jsonArray.getJSONObject(0);
                    String name = firstUser.getString("name");

                    this.setN(name);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

//                View view = findViewById(R.id.text);
//                TextView textView = (TextView) view;
//                textView.setText("HI how are you doing");

                Log.e("Json", this.result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void buttonAddaNewAccount(View view) {
//        String url = "https://test.api.amadeus.com/v1/shopping/flight-destinations?origin=PAR&maxPrice=200' -H 'Authorization: Bearer cCAE1JbD5ePyeOjgBDSvvTidLrCu";
//        new jsonTask().execute(url);
//        setContentsOfTextView(R.id.text, "1:" + result);

//        String url2 = "https://jsonplaceholder.typicode.com/users";
//        new jsonTask().execute(url2);
//        setContentsOfTextView(R.id.textTest, "2" + result);

    BackgroundProcess backgroundProcess = new BackgroundProcess();
    new Thread(backgroundProcess).start();
    String res = backgroundProcess.getResult();

        view = findViewById(R.id.text);
        TextView textView = (TextView) view;
        textView.setText(res);
//    String result = getDataFromUrl.getResult();
//        Log.e("Json", getDataFromUrl.getResult());




//    try {
//        JSONObject jsonObject = new JSONObject(result);
//        JSONArray jsonArray = jsonObject.getJSONArray("Users");
//        JSONObject firstUser = jsonArray.getJSONObject(0);
//        String name = firstUser.getString("name");
//
//        view = findViewById(R.id.text);
//        TextView textView = (TextView) view;
//        textView.setText(getDataFromUrl.getResult());
//
//    } catch (JSONException e) {
//        e.printStackTrace();
//    }

//    new jsonTask().execute();


    }

    /*This mutator sets the output level*/ // ---> More like a *system.out.println*
    public void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }
}


/* Check with the button
 * design the package and class structures
 * different functionalities */













/*

    From: DOHA International Airport
    From City: Doha
    Dept Date: today (1)
    "https://api.flightapi.io/compschedule/your-api-key?mode=departures&day=1&iata=DOH"

    To: New York International Airport
    From City: New York
    Arrival Date: Tmrw (2)
    "https://api.flightapi.io/compschedule/your-api-key?mode=arrival&day=2&iata=LGA"


 */
