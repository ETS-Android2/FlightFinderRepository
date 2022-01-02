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

//    String url = "https://jsonplaceholder.typicode.com/users";
    String url ="http://api.aviationstack.com/v1/flights?access_key=a040cf28d6f8b0e66f379a3f82fad839\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new jsonTask().execute();
    }

    class jsonTask extends AsyncTask<Void, Void, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Void... voids) {
            try {
                URL myurl = new URL(url);
                HttpURLConnection urlConnection = (HttpURLConnection) myurl.openConnection();
                InputStreamReader streamReader = new InputStreamReader(urlConnection.getInputStream());
                BufferedReader reader = new BufferedReader(streamReader);
                StringBuilder builder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }
                result = builder.toString();

                Log.e("Json", builder.toString());
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
            String names = "";
            try {
                JSONObject jsO = new JSONObject(s);
                JSONArray jsPagination = jsO.getJSONArray("data");
                JSONObject object = jsPagination.getJSONObject(0);


                setContentsOfTextView(R.id.text, object.toString());


//                JSONObject jsonObject = new JSONObject(s);
//                JSONArray jsonArray = jsonObject.getJSONArray("data");
//                setContentsOfTextView(R.id.text, jsonArray.getJSONObject(0).toString());

//                JSONArray jsonArray = new JSONArray(s);
//                for (int i = 0; i < jsonArray.length(); i++) {
//                    JSONObject object = jsonArray.getJSONObject(i);
//                    names += object.getString("name") + "\n";
//                }
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
//            setContentsOfTextView(R.id.text, names);
        }
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


















