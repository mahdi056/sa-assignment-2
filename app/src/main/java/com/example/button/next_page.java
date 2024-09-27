package com.example.button;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class next_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        SeekBar seekBar;
        TextView brightnessProgress;

        seekBar = findViewById(R.id.seekBar);
        brightnessProgress = findViewById(R.id.brightnessProgress);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                brightnessProgress.setText("Brightness: " + progress + " / " + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Switch swtch = findViewById(R.id.swtch);

        swtch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    seekBar.setProgress(40);
                    brightnessProgress.setText("Brightness: " + 40 + " / " + seekBar.getMax());
                } else {
                    seekBar.setProgress(60);
                    brightnessProgress.setText("Brightness: " + 60 + " / " + seekBar.getMax());
                }
            }
        });

    }
}