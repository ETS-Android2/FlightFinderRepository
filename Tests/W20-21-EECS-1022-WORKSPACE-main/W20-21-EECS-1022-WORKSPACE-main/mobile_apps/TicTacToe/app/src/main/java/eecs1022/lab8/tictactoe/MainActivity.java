package eecs1022.lab8.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import eecs1022.lab8.tictactoe.model.Game;

public class MainActivity extends AppCompatActivity {

    Game game;

    /* Hint: How do you share the same game object between button clicks
     * (attached with controller methods) of the app?
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Hint: How do you display the initial status to the output textview
         * when the app is first launched?
         */

        game = new Game("", "");
        setContentsOfTextView(R.id.outputText, "No game has been started.");
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

    /* this accessor retrieves input chosen from some spinner (drop-down menu) */
    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    /* Hints on controller methods:
     *
     * Declare two controller methods, each of which declared with a parameter with type View (see Week 9 Tutorials).
     *  - One method (say cm1) should be attached to the "START/RESTART" button,
     *      whereas the other method (say cm2) should be attached to the "MOVE" button.
     *
     *  - Controller method cm1 should:
     *    + Retrieve the names of the two players from the corresponding textfields.
     *    + Retrieve the player (who will play first) from the spinner.
     *    + Then, re-create the shared game object and invoke the relevant method(s).
     *    + Finally, display the expected output of the game (i.e., board and status) to the output textview.
     *
     * - Controller method cm2 should:
     *    + Retrieve the row and column numbers (as strings) from the corresponding textfields.
     *      You may need to convert the retrieved text, e.g., "1" to an integer value using Double.parseInt.
     *    + Then, invoke the relevant method(s) on the shared game object.
     *    + Finally, display the expected output of the game (i.e., board and status) to the ouptut textview.
     */

    public void buttonStartaNewGame(View view) {
        String playerX = getInputOfTextField(R.id.inputPlayerX);
        String playerO = getInputOfTextField(R.id.inputPlayerO);

        game = new Game(playerX, playerO);

        String spinnerTurn = getItemSelected(R.id.spinnerWhoPlaysFirst);

        if (spinnerTurn.equals("Player O")) {
            game.setWhoPlaysFirst('o');
        }

        String gameBoard = "";

        for (int i = 0; i < 3; i ++) {
            for (int m = 0; m < 3; m ++) {
                gameBoard += game.getBoard()[i][m] + " ";

            }
            gameBoard += "\n";
        }

        String output = "Current Game Board: \n" + gameBoard + "\n Current Game Status: \n" + game.getStatus();
        setContentsOfTextView(R.id.outputText, output);
    }

    public void changeTheRowsAndColumns(View view) {
        String rowS = getInputOfTextField(R.id.inputRow);
        String colS = getInputOfTextField(R.id.inputCol);

        int rowInt = Integer.parseInt(rowS);
        int colInt = Integer.parseInt(colS);

        game.move(rowInt, colInt);

        String gameBoard = "";

        for (int i = 0; i < 3; i ++) {
            for (int m = 0; m < 3; m ++) {
                gameBoard += game.getBoard()[i][m] + " ";

            }
            gameBoard += "\n";
        }

        String output = "Current Game Board: \n" + gameBoard + "\nCurrent Game Status: \n" + game.getStatus();
        setContentsOfTextView(R.id.outputText, output);
    }

}
