package winter21_22.flightscanner;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignupPage extends AppCompatActivity {
    private TextView alreadyAMemberLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        // changing from MainPage -> SignUpPage
        this.alreadyAMemberLogin = findViewById(R.id.labelAlreadyLogin);
        this.alreadyAMemberLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupPage.this, LoginPage.class);
                startActivity(intent);
            }
        });
    }
}