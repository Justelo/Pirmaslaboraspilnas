package com.example.a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button changeTextButton;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = (TextView)findViewById(R.id.tvMessage);
        changeTextButton = (Button)findViewById(R.id.bChangeText);
        changeTextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                message.setText("Antras tekstas");
            }
        });
    }
}
