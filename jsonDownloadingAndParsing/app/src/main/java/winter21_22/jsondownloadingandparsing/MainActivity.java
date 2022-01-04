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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class MainActivity extends AppCompatActivity {

    String result = "";
    String result2 = "";
    static int counter = 0;

    //    String url = "https://jsonplaceholder.typicode.com/users";
//    String url = "http://api.aviationstack.com/v1/flights?access_key=a040cf28d6f8b0e66f379a3f82fad839\n";
//     String url = "http://api.aviationstack.com/v1/flights\n? access_key = a040cf28d6f8b0e66f379a3f82fad839";
//    String url = "https://api.flightapi.io/iata/61d3809713b15b74ee7b9a07/new%20york/airport"; // flightapi.io
//    String url = "https://api.npoint.io/1192ddce993fbd4bbc7e";
    String url = "https://api.npoint.io/8d8df57b1acc46aeb49d";
//    String url = "https://api.npoint.io/8d8df57b1acc46aeb49d";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DataUsers dataUsers = new DataUsers();
//        dataUsers.getDataFromUrl();
//        String firstName = dataUsers.getFirstName();
//
//        setContentsOfTextView(R.id.text, firstName);

        new jsonTask().execute(url);
//        setContentsOfTextView(R.id.text, s.toString());

    }

    class jsonTask extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... param) {
            counter ++;
            try {
                URL myurl = new URL(param[0]);
                HttpURLConnection urlConnection = (HttpURLConnection) myurl.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.setConnectTimeout(5000); //5000 milli seconds
                urlConnection.setReadTimeout(5000);


                InputStreamReader streamReader = new InputStreamReader(urlConnection.getInputStream());
                BufferedReader reader = new BufferedReader(streamReader);
                StringBuilder builder = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }

                if (counter == 0) {
                    result = builder.toString();
                }
                else {
                    result2 = builder.toString();
                }
                reader.close();

                Log.e("Json", result);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return result;
        }

        @Override
        protected void onPostExecute(String s) {

            super.onPostExecute(s);
            setResult(s);
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

    public void setResult(String a) {
        result = a;
    }

    public void buttonAddaNewAccount(View view) {
        String url = "https://api.npoint.io/8d8df57b1acc46aeb49d";
        new jsonTask().execute(url);
        setContentsOfTextView(R.id.text, "1:" + result);

        String url2 = "https://jsonplaceholder.typicode.com/users";
        new jsonTask().execute(url2);
        setContentsOfTextView(R.id.textTest, "2" + result2);
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
