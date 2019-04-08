package com.example.hp.homework_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class AutorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autor);

        TextView myText = findViewById(R.id.textAbout);
        myText.setMovementMethod(new ScrollingMovementMethod());


        Button topic = findViewById(R.id.buttonTopic);
        topic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTopic = new Intent(AutorActivity.this, MainActivity.class);
                startActivity(intentTopic);
            }
        });

        ImageButton buttonTelega = findViewById(R.id.imageTelega);
        buttonTelega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toastTelega = Toast.makeText(getApplicationContext(), "Ебать РКН!", Toast.LENGTH_LONG);
                toastTelega.setGravity(Gravity.CENTER,0,0);
                toastTelega.show();
            }
        });

        ImageButton buttonTwit = findViewById(R.id.imageTwit);
        buttonTwit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toastTwit = Toast.makeText(getApplicationContext(), "Летят перелетные птицы...", Toast.LENGTH_LONG);
                toastTwit.setGravity(Gravity.CENTER,0,0);
                toastTwit.show();
            }
        });

    }

}
