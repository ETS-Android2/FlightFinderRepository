package winter21_22.flightscanner;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainPage extends AppCompatActivity {
    private Button login;
    private Button signup;

    /* Used for departure and return dates */
    Calendar calendar = Calendar.getInstance();
    final int year = calendar.get(Calendar.YEAR);
    final int month = calendar.get(Calendar.MONTH);
    final int day = calendar.get(Calendar.DAY_OF_MONTH);

    /* Calendar related attributes */
    TextView departDate;
    DatePickerDialog.OnDateSetListener setListenerDepart;
    TextView returnDate;
    DatePickerDialog.OnDateSetListener setListenerReturn;
    /*************************************************/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        /*------------------------------Scrolling Calendar Selection - Departure ---------------------------*/
        departDate = findViewById(R.id.inputDepartDate);

        departDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        MainPage.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth
                        , setListenerDepart, year, month, day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        setListenerDepart = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                month += 1;
                String date = day+"/"+month+"/"+year;
                departDate.setText(date);
            }
        };

        /*------------------------------Scrolling Calendar Selection - Return---------------------------*/
        returnDate = findViewById(R.id.inputReturnDate);

        returnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        MainPage.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth
                        , setListenerReturn, year, month, day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        setListenerReturn = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                month += 1;
                String date = day+"/"+month+"/"+year;
                returnDate.setText(date);
            }
        };
        /*----------------------------------------------------------------------------------------*/

        // changing from loginMainPage -> loginPage
        this.login = findViewById(R.id.buttonLoginMainPage);
        this.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainPage.this, LoginPage.class);
                startActivity(intent);
            }
        });

        // changing from MainPage -> SignUpPage
        this.signup = findViewById(R.id.buttonSignUp);
        this.signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainPage.this, SignupPage.class);
                startActivity(intent);
            }
        });
    }

}