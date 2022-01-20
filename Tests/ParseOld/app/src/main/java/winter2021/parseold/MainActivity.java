package winter2021.parseold;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import winter2021.parseold.model.Computation;


public class MainActivity extends AppCompatActivity {
    String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Computation computation = new Computation();
        String jsonUserObject = computation.parse();
        this.output = "Hi how are you";
    }

    /* 3 helper methods you can assume */

    /*This mutator sets the output level*/ // ---> More like a *system.out.println*
    private void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    // Controller method to be attached to some GUE component(s)
    public void parseButton(View view) {
        // Display output on the text view.
        setContentsOfTextView(R.id.labelOutput, this.output);
    }


}