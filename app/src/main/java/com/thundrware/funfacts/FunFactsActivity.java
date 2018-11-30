package com.thundrware.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    // Declare our view variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the view from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);

        showFactButton.setOnClickListener(view -> {
            String fact = factBook.getFact();
            Integer color = colorWheel.getColor();

            // Update the screen with our new fact
            factTextView.setText(fact);
            relativeLayout.setBackgroundColor(color);
            showFactButton.setTextColor(color);
        });

    }
}
