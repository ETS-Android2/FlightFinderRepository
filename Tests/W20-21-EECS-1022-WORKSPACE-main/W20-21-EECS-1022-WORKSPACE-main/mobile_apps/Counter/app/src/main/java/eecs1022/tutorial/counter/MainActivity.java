package eecs1022.tutorial.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import eecs1022.tutorial.counter.model.Counter;

public class MainActivity extends AppCompatActivity {
    // Global class
    Counter c;          // This is here because we would like to use the class Counter and this will help is to use it in the MainActivity class.

    // Constructor for the app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = new Counter(0); // Before the user's input a Counter object with a 0 value has been created automatically.
    }

    /* this mutator sets the output label */
    private void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    /* this accessor retrieves input entered on the text view  */
    private String getInputOfTextField(int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    /* this accessor retrieves input chosen from some spinner (drop-down menu) */  // --> Not needed for this Application
    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    /*---------------------------------------------------------------------------------------*/
        // The purple colours that are used as parameters are label names from Activity_main.xml

        /* We need three counter methods for three buttons */
    public void computeButtonCreateCounterClicked(View view) {
        //  retrieve input from GUI
        String textInitValue = getInputOfTextField(R.id.inputInitValue);
        int initValue = Integer.parseInt(textInitValue);
        // e.g, d = Double.parseDouble(textInitValue); if input was double

        // execute effects on model objects
        c = new Counter(initValue);  // It creates a new instance of the c object

        // output to the device screen
        setContentsOfTextView(R.id.outputCounterValue,  "Counter Value: " + c.getValue());
    }

    public void computeButtonCreateIncrementClicked(View view) {
        c.increment();
        setContentsOfTextView(R.id.outputCounterValue,  "Counter Value: " + c.getValue());
    }

    public void computeButtonCreateDecrementClicked(View view) {
        c.decrement();
        setContentsOfTextView(R.id.outputCounterValue,  "Counter Value: " + c.getValue());
    }

}