package club.gumad.gufacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get a fact from server
        getFact();
        //
        //Create listener for when the Button is pressed.
        final Button button = (Button) findViewById(R.id.fact_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getFact(); //When the button is pressed, get a new fact
            }
        });

    }

    private void getFact() {
        //Get Text View
        final TextView factText = (TextView) findViewById(R.id.fact_text);
        //Set the text to loading
        factText.setText(R.string.loading);
        //Retrieve the message
        //TOOD: Get message from server
        String msg = "";
        //Set the text to be the message
        factText.setText(msg);
        //Done
    }
}
