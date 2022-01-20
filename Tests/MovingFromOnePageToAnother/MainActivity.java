package winter2021_2022.flightstation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.move=findViewById(R.id.buttonAct1); // id should be whatever id you have give your button
        this.move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
		// goes from activity one to acitivity2 page
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}





















