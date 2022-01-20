package winter21_22.sampledataparse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView labelOutput;
    ComputeParse computeParse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         this.computeParse = new ComputeParse();
    }

    private void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    // Controller method to be attached to some GUE component(s)
    public void computeButtonParse(View view) {

        this.computeParse.readURLData();
        String parsedObject = this.computeParse.getDataParsed();

        // Display output on the text view.
        setContentsOfTextView(R.id.labelOutput, parsedObject);
    }
}