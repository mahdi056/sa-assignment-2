package com.example.button;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox samsung, apple, oneplus;
    RadioGroup radioGroup;
    RatingBar ratingBar;
    TextView ratingResult;
    Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        samsung = findViewById(R.id.checkbox_samsung);
        apple = findViewById(R.id.checkbox_apple);
        oneplus = findViewById(R.id.checkbox_oneplus);

        radioGroup = findViewById(R.id.radioGroup);

        ratingBar = findViewById(R.id.ratingBar);
        ratingResult = findViewById(R.id.ratingResult);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratingResult.setText("Rating: " + rating);
            }
        });

    btnnext = findViewById(R.id.btn_next);

        btnnext.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, next_page.class);
            startActivity(intent);
        });








    }
}