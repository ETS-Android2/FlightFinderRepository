package winter2021.testtest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import winter2021.testtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<String> userList;
    Handler mainHandler = new Handler();
    ProgressDialog progressDialog;

    ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater()); //
        setContentView(binding.getRoot());

        initalizeUserlist();
        binding.fetchDatabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new fetchData().start();
            }
        });
        new fetchData().start();
    }

    public void initalizeUserlist() {
        userList = new ArrayList<>();
        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, userList);
        binding.usersList.setAdapter(listAdapter);
    }

    class fetchData extends Thread{
        String data = "";

        @Override
        public void run() {

            mainHandler.post(new Runnable() {
                @Override
                public void run() {

                    progressDialog = new ProgressDialog(MainActivity.this);
                    progressDialog.setMessage("Fetching Data");
                    progressDialog.setCancelable(true);
                    progressDialog.show();
                }
            });

            try {
                URL url = new URL("https://api.npoint.io/8d8df57b1acc46aeb49d");
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    data += line;
                }

                if (!data.isEmpty()) {
                    try {
                        JSONObject jsonObject = new JSONObject(data);
                        JSONArray users = jsonObject.getJSONArray("Users");
                        userList.clear();
                        for (int i = 0; i < users.length(); i ++) {
                            JSONObject names = users.getJSONObject(i);
                            String name = names.getString("name");
                            userList.add(name);
                        }


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            mainHandler.post(new Runnable() {
                @Override
                public void run() {
                    if (progressDialog.isShowing()) {
                        progressDialog.dismiss();
                        listAdapter.notifyDataSetChanged();
                    }
                }
            });
        }
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        binding = ActivityMainBinding.inflate(getLayoutInflater()); //
//        setContentView(binding.getRoot());
//
//        initalizeUserlist();
//        binding.fetchDatabtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                new fetchData().start();
//            }
//        });
//        new fetchData().start();
//    }
//
//    public void initalizeUserlist() {
//        userList = new ArrayList<>();
//        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, userList);
//        binding.usersList.setAdapter(listAdapter);
//    }
//
//    class fetchData extends Thread{
//        String data = "";
//
//        @Override
//        public void run() {
//
//            mainHandler.post(new Runnable() {
//                @Override
//                public void run() {
//
//                    progressDialog = new ProgressDialog(MainActivity.this);
//                    progressDialog.setMessage("Fetching Data");
//                    progressDialog.setCancelable(true);
//                    progressDialog.show();
//                }
//            });
//
//            try {
//                URL url = new URL("https://api.npoint.io/8d8df57b1acc46aeb49d");
//                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//                InputStream inputStream = httpURLConnection.getInputStream();
//                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//                String line;
//
//                while ((line = bufferedReader.readLine()) != null) {
//                    data += line;
//                }
//
//                if (!data.isEmpty()) {
//                    try {
//                        JSONObject jsonObject = new JSONObject(data);
//                        JSONArray users = jsonObject.getJSONArray("Users");
//                        userList.clear();
//                        for (int i = 0; i < users.length(); i ++) {
//                            JSONObject names = users.getJSONObject(i);
//                            String name = names.getString("name");
//                            userList.add(name);
//                        }
//
//
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            mainHandler.post(new Runnable() {
//                @Override
//                public void run() {
//                    if (progressDialog.isShowing()) {
//                        progressDialog.dismiss();
//                        listAdapter.notifyDataSetChanged();
//                    }
//                }
//            });
//        }
//    }
}